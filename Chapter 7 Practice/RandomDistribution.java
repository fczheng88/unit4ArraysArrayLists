public class RandomDistribution
{
    public static void main(String[] args)
    {
        java.util.Scanner r = new java.util.Scanner(System.in);
        System.out.print("How many numbers do you want to generate? ");
        int numNums = r.nextInt();
        System.out.print("What is the number of values for each random draw? ");
        int numVals = r.nextInt();
        
        int[] x = new int[numVals];
        for(int i=0; i<x.length; i++)
        { 
            x[i]=0;
        }
       
        for(int i = 0; i<numNums;i++)
        {
            x[(int)(Math.random()*numVals)]+=1;
        }
        for(int i=0; i<x.length;i++)
        {
            System.out.println(i+": "+x[i]);
        }
    }
}
