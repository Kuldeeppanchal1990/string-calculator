package org.incubyte;

public class StringCalculator {


    public static final String COMMA_SEPARATED = ",";

    public int calculate(String number) {

        String[] nos = number.split(COMMA_SEPARATED);

        int sum = 0;
        for(String no : nos) {
            int n = Integer.valueOf(no);
            sum+=n;
        }

        return sum;

    }
}
