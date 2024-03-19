import java.util.Scanner;

public class Main {
    public static void main (final String [] arguments) {

        System.out.println ("Starting...");

        Scanner console = new Scanner (System.in);
        System.out.print ("How many total prime numbers should be calculated? Assume that 2 is the first prime number.\n");
        final int count = console.nextInt ();
        console.close ();

        final int [] primeNumbers = PrimeNumbers.primeNumbers (count);

        System.out.println ();

        for (int primeNumber : primeNumbers) {
            System.out.println (primeNumber);
        }
        System.out.println ("\nDone!");
    }
}
