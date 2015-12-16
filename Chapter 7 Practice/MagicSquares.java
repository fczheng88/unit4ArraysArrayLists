import java.util.Scanner;
import java.util.Arrays;

public class MagicSquares
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 16 numbers to go into a 4x4 square as follows: \n-> -> -> ->\n-> -> -> ->\n-> -> -> ->\n-> -> -> ->");
        int[][] sq = new int[4][4];
        boolean isCorrectSquare = false;
        while(!isCorrectSquare)
        {
            for(int[] arr: sq)
            {
                for(int i = 0;i<arr.length;i++)
                {
                    arr[i] = s.nextInt();
                }
            }
            System.out.println("You entered:\n"+toString(sq));
            System.out.print("Is that correct (y/n)? ");
            if(s.next().toLowerCase().equals("y"))
            {
                isCorrectSquare=true;
            }
            
        }
        if(isSame(sq))
        {
            System.out.println("That is a magic square!");
        }
        else
        {
            System.out.println("That is not a magic square!");
        }

        
    }

    public static boolean isSame(int[][] sq)
    {
        int sumRow1 = sumRow(sq, 0);
        boolean isSame = true;
        for(int i = 0;i<sq.length;i++)
        {
            if(sumRow(sq, i)!=sumRow1||sumCol(sq, i)!=sumRow1)
            {
                isSame=false;
            }
        }
        if(sumDiag(sq, true)!=sumDiag(sq, false)||sumDiag(sq, true)!=sumRow1||sumDiag(sq,false)!=sumRow1)
        {
            isSame=false;
        }
        return isSame;
    }

    public static int sumRow(int[][] sq, int row)
    {
        int total = 0;
        for(int value: sq[1])
        {
            total+=value;
        }
        return total;
    }

    public static int sumCol(int[][] sq, int col)
    {
        int total = 0;
        for(int[] arr: sq)
        {
            total+=arr[col];
        }
        return total;
    }

    public static int sumDiag(int[][] sq, boolean isULCToLRC)
    {
        int total = 0;
        if(isULCToLRC)
        {
            for(int i = 0;i<sq.length;i++)
            {
                total+=sq[i][i];
            }
        }
        else
        {
            for(int i = 0;i<sq.length;i++)
            {
                total+=sq[i][sq.length-i-1];
            }
        }
        return total;
    }

    public static String toString(int[][] sq)
    {
        String ret="";
        for(int[] arr:sq)
        {
            ret+=Arrays.toString(arr)+"\n";
        }
        return ret;
    }
}