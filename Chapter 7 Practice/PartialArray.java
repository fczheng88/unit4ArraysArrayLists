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

    public void growArray()
    {
        //meh;
        int[] newArray = new int[this.currentSize*2];
        for(int i =0;i<this.currentSize;i++)
        {
            newArray[i] = values[i];
        }
    }

    public void insert(int pos, int val)
    {
        if(this.currentSize == this.values.length)
        {
            this.growArray();
        }
        currentSize++;
        for(int i = currentSize-1;i>val;i--)
        {
            values[i]=values[i-1];
        }
        values[pos]=val;
    }

    public void swap(int posA, int posB)
    {
        int temp = this.values[posA];
        this.values[posA]=this.values[posB];
        this.values[posB]=temp;
    }
}