public class Sieve
{
    public int max;
    public int[] nums, primes;
    public Sieve(int mas)
    {
        max=mas;
        if(max%2==0)
        {
            nums=new int[max/2];
        }
        else
        {
            nums=new int[(max+1)/2];
        }
        int currentNum;
        for(int i = 1;i<nums.length;i++)
        {
            nums[i-1]=i*2+1;
        }
    }
    public void sieve()
    {
        
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            if(num!=0)//avoid divide by 0, skip previous elements
            {
                for(int j = 0;j<nums.length;j++)
                {
                    if(nums[j]%num==0&&nums[j]!=num)
                    {
                        nums[j]=0;
                    }
                }
            }
        }
        primes = this.moveToFront();
    }
    public int[] moveToFront()
    {
        int[] retW0 = new int[nums.length];
        int[] ret;
        int curSize = 0;
        int numElements = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                retW0[curSize]=nums[i];
                curSize++;
            }
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(retW0[i]==0)
            {
                numElements=i;
                break;
            }
        }
        ret = new int[numElements];
        for(int i=0;i<numElements;i++)
        {
            ret[i]=retW0[i];
        }
        return ret;
    }
    public int[] primes()
    {
        return primes;
    }
    public boolean isPrime(int num)
    {
        for(int value: primes)
        {
            if(value==num)
            {
                return true;
            }
        }
        return false;
    }
}