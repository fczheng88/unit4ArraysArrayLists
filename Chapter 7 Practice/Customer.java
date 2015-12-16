
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private double amount;
    private String name;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, double amount)
    {
        this.name = name;
        this.amount = amount;
    }

    public String toString()
    {
        // put your code here
        return name+", "+amount;
    }
    public String name()
    {
        return name;
    }
    public double amount()
    {return amount;}
}
