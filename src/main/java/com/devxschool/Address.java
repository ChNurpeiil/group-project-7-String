package com.devxschool;

import java.util.Scanner;

public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

        String addres = "2400 E Devon Ave #215, Des Plaines, IL 60018";
        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter street address: " + getStreetAddress(address));
        System.out.println("Enter city: " + getCity(address));
        System.out.println("Enter state: " + getState(address));
        System.out.println("Enter  zipcode: " + getZipcode(address));
    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        return null;
    }

    public static String getCity(String address) {
        return null;
    }

    public static String getState(String address) {
        return null;
    }

    public static int getZipcode(String address) {
        return -1;
    }
}
