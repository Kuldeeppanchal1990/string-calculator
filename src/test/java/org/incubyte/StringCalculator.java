package org.incubyte;

public class StringCalculator {


    public int calculate(String number) {

        int n = Integer.valueOf(number);
        if (n>0) {
            return 1;
        } else {
            return 0;
        }
    }
}
