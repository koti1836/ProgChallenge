package com.java.reverse.q1;

public class ReverseStr {
    public static void main(String[] args){
        System.out.println(reverseTheString("Welcome"));
    }

    public static String reverseTheString(String input){
        StringBuilder reverse = new StringBuilder();


        // Traversing the string in reverse and adding it to the string builder
        for(int i = input.length() - 1; i >= 0; i-- ){
            reverse.append(input.charAt(i));
        }

        return reverse.toString();

    }
}