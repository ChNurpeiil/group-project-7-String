package com.devxschool;

import java.util.Scanner;

public class Concatenation {

    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter first word: ");
        String word1 = sc.next();
        System.out.println("Please enter second word: ");
        String word2 = sc.next();
        System.out.println(concat(word1,word2));
    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD

        return word1.concat(word2);
    }
}
