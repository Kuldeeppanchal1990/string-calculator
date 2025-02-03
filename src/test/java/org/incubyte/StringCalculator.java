package org.incubyte;

public class StringCalculator {


    public static final String COMMA_SEPARATED = ",";
    public static final String SLASHN_SEPARATED = "\n";
    public static final String CUSTOM_DELIMITER_INDICATOR = "//";

    public int calculate(String inputString) {

        String delimiter = COMMA_SEPARATED + "|" + SLASHN_SEPARATED;

        if (inputString.startsWith(CUSTOM_DELIMITER_INDICATOR)) {
            String[] splittedInput = inputString.split(SLASHN_SEPARATED,2);
            delimiter = splittedInput[0].substring(CUSTOM_DELIMITER_INDICATOR.length());
            inputString = splittedInput[1];
        }

        String[] nos = inputString.split(delimiter);

        int sum = 0;
        for(String no : nos) {
            int n = Integer.valueOf(no);
            sum+=n;
        }

        return sum;

    }
}
