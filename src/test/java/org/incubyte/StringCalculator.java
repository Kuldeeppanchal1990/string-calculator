package org.incubyte;

public class StringCalculator {


    public static final String COMMA_SEPARATED = ",";
    public static final String SLASHN_SEPARATED = "\n";

    public int calculate(String number) {

        String[] nos = number.split(COMMA_SEPARATED + "|" + SLASHN_SEPARATED);

        int sum = 0;
        for(String no : nos) {
            int n = Integer.valueOf(no);
            sum+=n;
        }

        return sum;

    }
}
