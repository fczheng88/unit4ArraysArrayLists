public class ArrayOperations
{
    public static void mian(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("The length of the array is: "+x.length);
        System.out.println("The first array item is: "+x[0]);
        System.out.println("The last array item is: "+x[x.length-1]);
        System.out.println("The last array ite is: "+x[x.length-1]);
        System.out.print("The complete array is: ");
        for(double value : x)
        {
            System.out.print(value+" ");
        }
        System.out.println();
        for(int i=0; i<x.length;i++)
        {
            System.out.println("x.["+i+"] is: "+x[i]);
        }
        for(int i=x.length-1;i>=0;i--)
        {
            System.out.println("x.["+i+"] is: "+x[i]);
        }
        //meh
    }
}