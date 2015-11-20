import java.util.Arrays;
public class ArrayPractice
{
    public static int[] x = {1,4,9,16,25};
    public static void exceptionExample()
    {
        int val = x[5];
    }

    public static void fillin()
    {
        int[] values = new int[100];
        for(int i = 0;i<values.length;i++)
        {
            values[i] = i*i;
        }
        System.out.println( values );
        System.out.println( Arrays.toString( values));

    }
    public static int findMax()
    {
        int largest;
        largest=x[0];
        for(int val: x)
        {
            if(val>largest)
            {
                largest=val;
            }
        }
        return largest;
    }
}