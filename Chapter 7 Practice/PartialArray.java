public class PartialArray
{
    private int[] values;
    private int currentSize;
    
    public PartialArray()
    {
        values = new int[100];
        for(currentSize = 0; currentSize<20; currentSize++)
        {
            values[currentSize] = currentSize*currentSize;
        }
    }
    public void remove(int pos)
    {
        for(int i = pos+1; i< currentSize; i++)
        {
            values[i-1]=values[i];
        }
        currentSize--;
    }
    public void insert(int pos, int val)
    {
        if(currentSize<values.length)
        {
            currentSize++;
            for(int i = currentSize-1;i>val;i--)
            {
                values[i]=values[i-1];
            }
            values[pos]=val;
        }
    }
}