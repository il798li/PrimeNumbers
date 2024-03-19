import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumbers {

    public static int [] toList (ArrayList <Integer> integers) {
        int [] ints = new int [integers.size ()];
        for (int index = 0; index < ints.length; index++) {
            ints [index] = integers.get (index);
        }
        return ints;
    }

    public static int [] primeNumbers (final int count) {
        ArrayList <Integer> primeNumbers = new ArrayList <Integer> ();
        int found = 0;
        int number = 2;
        while (found < count) {
            if (isPrime (number)) {
                primeNumbers.add (number);
                found += 1;
            }
            number += 1;
        }
        return toList (primeNumbers);
    }

    public static boolean isPrime (final int number) {
        if (number == 2) {
            return true;
        }
        for (int factor = 2; factor < number; factor += 1) {
            if (isDivisible (number, factor)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisible (final int dividend, final int divisor) {
        return dividend % divisor == 0;
    }
}