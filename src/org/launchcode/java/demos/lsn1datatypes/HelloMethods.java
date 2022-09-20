package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;


public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter fr or sp or any string:");
        String givenName = input.next();
        input.close();
        String message = Message.getMessage(givenName);
        System.out.println(message);
    }

}
