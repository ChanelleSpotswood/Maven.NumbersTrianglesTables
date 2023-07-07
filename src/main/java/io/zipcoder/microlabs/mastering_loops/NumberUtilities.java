package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";

        for (int i = start; i < stop; i++) {
            if (!isOdd(i)) {
                result = result + i;
            }
        }
        return result;
    }
    // String oddNumbers = "";
    // for (int i = start; i < stop; i++) {
    //  if (i % 2 == 0) {
    // oddNumbers += i;
    // declared a variable called odd numbers
    // created a loop to hit start and stop
    // return oddNumbers;


    public static String getRange(int stop) {
        return getRange(0, stop, 1);
        // return getRange(0, stop);
        // different methods with minor differences
        // cleaner code w/ using method overload
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
        // return getRange(0, stop,1);
        // step 1 b/c you want every number to go by 1 bc it was not specified
    }

    public static String getRange(int start, int stop, int step) {
        return getExponentiation(start, stop, step, 1);
        // String range = "";
        // for (int i = start; i < stop; i=i+step) {
        // range += i;
        //return range;
    }
    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiation(start, stop, step, 2);

    }

    public static String getExponentiation(int start, int stop, int step, int exponent) {

            StringBuilder sb = new StringBuilder();

            for (int i = start; i < stop; i += step) {
                // for loop which multiplied i 'exponent' times
                sb.append((int) Math.pow(i, exponent));
            }
            return sb.toString();
        }
    }
