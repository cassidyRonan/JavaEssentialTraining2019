package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);

        var result2 = 10 + 20;

        int intVal = 42;
        var fromInt = Integer.toString(intVal);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);
    }
}
