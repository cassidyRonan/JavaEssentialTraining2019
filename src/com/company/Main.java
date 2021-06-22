package com.company;

public class Main {

    public static void main(String[] args) {

        //This will work because java is checking memory for a value that matches S2 and then points to it hence the objects are the same
        String s1 = "Hello!";
        var s2 = "Hello!";

        if(s1 == s2){
            System.out.println("They match!");
        }
        else{
            System.out.println("They don't match!");
        }

        //This won't work because s3 and s4 are two seperate objects
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if(s3 == s4){
            System.out.println("They match!");
        }
        else{
            System.out.println("They don't match!");
        }

        //Use the built in string method equals to avoid this issue
        if(s3.equals(s4)){
            System.out.println("They match!");
        }
        else{
            System.out.println("They don't match!");
        }

        //We can also ignore case using an alternate method
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("They match!");
        }
        else{
            System.out.println("They don't match!");
        }
    }
}
