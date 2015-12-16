public class SieveRunner
{
    public static void main(String[] args)
    {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("This program will find all the primes up to the number you will specify.");
        System.out.print("Number: ");
        int num = s.nextInt();
        Sieve sieve = new Sieve(num);
        sieve.sieve();
        System.out.println(java.util.Arrays.toString(sieve.primes()));
        
        
        System.out.print("Test if your number is prime: ");
        System.out.println(sieve.isPrime(s.nextInt()));
    }
}