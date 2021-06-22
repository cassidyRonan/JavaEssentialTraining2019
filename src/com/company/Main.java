package com.company;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        // We can utilise %s as a holder for a string value, %f for a float
        //Adding .2 in the middle of %f truncates it to 2 decimal places
        var template = "Clothing iem: %s, size %s, color %s, $%.2f";

        //Then we can pass this template to String.Format and as many objects as we need
        var itemString = String.format(template,item,size,color,price);

        System.out.println(itemString);

    }
}
