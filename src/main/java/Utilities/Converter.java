package Utilities;

import java.text.DecimalFormat;

public class Converter {

    private static final DecimalFormat formatter = new DecimalFormat("0.00");

    public static String toString(double input){
        return String.valueOf(formatter.format(input));
    }
    public static double toDouble(String input) {
        return Double.parseDouble(input);
    }
}
