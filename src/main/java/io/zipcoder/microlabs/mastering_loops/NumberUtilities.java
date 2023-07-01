package io.zipcoder.microlabs.mastering_loops;


import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String chanelle = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
        chanelle += i;
            }
        }
        return chanelle;
    }

    public boolean isEven(int n) {
        if (n % 2 == 0){
            return true;
        }
        return false;
     }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                oddNumbers += i;
                //declared a variable called odd numbers
                //created a loop to hit start and stop
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop; i=i+step) {
            squareNumbers += i*i;
        }
        return squareNumbers;
        // i*i is multiplying the number by itself
        // i=i+step, how to get from the start to the stop
    }

    public static String getRange(int stop) {
        return getRange(0, stop);
    }
    // different methods with minor differences
    // cleaner code w/ using method overload
    public static String getRange(int start, int stop) {
        return getRange(0, stop,1);
    }
// step 1 b/c you want every number to go by 1 bc it was not specified

    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i=i+step) {
            range += i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String range = "";
        for (int i = start; i < stop; i=i+step) {
            range += i;
        }
        return null;
    }
}
//Unsure how to add an exponent
