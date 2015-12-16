public class ArrayOps2
{
    public static int[] x;
    public static void main(String[] args)
    {
        x = new int[] {0,1,2,3,4,5,6,7,8,9};

    }

    public void swapFirstAndLast()
    {
        int last = x[x.length-1];
        x[x.length-1] = x[0];
        x[0] = last;
    }

    public void shiftRight()
    {
        for(int i =x.length-1; i>0;i--)
        {
            x[i] = x[i-1];
        }
    }

    public void replaceEvensWithZero()
    {
        for(int i = 0; i<x.length-1;i+=2)
        {
            x[i] = 0;
        }
    }

    public void replaceLarger()
    {
        int[] y=new int[x.length];
        y[0]=x[0];
        y[y.length-1]=x[x.length-1];
        for(int i =1; i<x.length-2;i++)
        {
            if(x[i-1]>x[i+1])
            {
                y[i]=x[i-1];
            }
            else
            {
                y[i]=x[i+1];
            }
        }
    }

    public void removeMiddle()
    {
        int mid = x.length/2;
        if(x.length%2==0)
        {
            for(int i=mid;i<x.length-2;i++)
            {
                x[i]=x[i+2];
            }
        }
        else
        {
            for(int i=mid;i<x.length-1;i++)
            {
                x[i]=x[i+1];
            }
        }
    }

    public void evenToFront()
    {
        for(int i = 0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                int num=x[i];
                for(int j =i; j>0;j--)
                {
                    x[j] = x[j-1];
                }
                x[0]=num;
            }
        }
    }

    public int secondLargest()
    {
        int largest, secLargest;
        largest=secLargest=x[0];
        for(int val: x)
        {
            if(val>largest)
            {
                secLargest=largest;
                largest=val;
            }
        }
        return secLargest;
    }

    public boolean isSorted()
    {
        return isSorted();
    }

    public boolean hasAdjDup()
    {
        return hasAdjDup();
    }

    public boolean hasDuplicate()
    {
        return hasDuplicate();
    }

}
