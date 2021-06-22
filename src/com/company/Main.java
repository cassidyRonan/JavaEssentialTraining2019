package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        //In this exercise we are formatting numeric values as strings

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number:" + numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number:" + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number:" + intF.format(doubleValue));

        //Allows us to specify a locale, very useful for setting to local standards
        var locale = new Locale("de","DE");
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number:" + localFormatter.format(doubleValue));

        //Currency formatting
        var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(doubleValue));

        //Printing value using a pattern
        var df = new DecimalFormat("€00.00");
        System.out.println(df.format(doubleValue));
    }
}
