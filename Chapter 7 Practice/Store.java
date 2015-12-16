import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Store
{

    static ArrayList<Customer> custArr = new ArrayList<Customer>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int addedPrice = 1;
        while(addedPrice !=0)
        {
            System.out.print("\nPlease enter the customer's Name: ");
            String name = s.next();
            System.out.print("Please enter the customer's purchase amount (0 to end input): ");
            addedPrice = s.nextInt();
            if(addedPrice !=0)
            {addSale(toTitle(name), addedPrice);}
        }
        System.out.println("The best customer is "+bestCustomer().name()+" and he/she purchased $"+bestCustomer().amount()+" worth of items.");
        System.out.println("The full list of customers: "+custArr);
    }

    public static String toTitle(String original)
    {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }

    public static void addSale(String custName, double amount)
    {
        custArr.add(new Customer(custName, amount));
    }

    public static Customer bestCustomer()
    {
        Random rand = new Random();
        if(custArr.size()==0)
        {
            return new Customer("There are no customers", 0);
        }

        return custArr.get((int)(rand.nextDouble()*custArr.size()));
    }
}
