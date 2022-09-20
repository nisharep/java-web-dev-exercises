package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class Miles_per_gallon {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the miles you have driven");
        double miles = input.nextDouble();
        System.out.println("Please enter the amount of gas you used in gallons");
        double fuelInGallons = input.nextDouble();
        input.close();
        System.out.println("You are driving on " + miles/fuelInGallons + " mpg");
    }
}
