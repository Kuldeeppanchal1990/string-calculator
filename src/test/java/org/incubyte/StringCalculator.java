package org.incubyte;

public class StringCalculator {


    public int calculate(String number) {

        String[] nos = number.split(",");

        int sum = 0;
        for(String no : nos) {
            int n = Integer.valueOf(no);
            sum+=n;
        }

        return sum;

    }
}
