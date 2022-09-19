package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");

        if(input.hasNextDouble() || input.hasNextFloat() || input.hasNextInt()) {
            double radius = input.nextDouble();
                if(radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area );
                }
                else{
                System.out.println("Please Enter a Positive Value");
                }
        }else {
            System.out.println("Please Enter a Valid Value");
        }

        input.close();
    }
}
