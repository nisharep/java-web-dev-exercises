package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Hello, Please enter your name");
        String givenName = input.nextLine();
        input.close();
        System.out.println("Hello " + givenName);
    }
}
