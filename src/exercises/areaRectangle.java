package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class areaRectangle {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter length of the rectangle");
        int length = input.nextInt();
        System.out.println("Please enter width of the rectangle");
        int width = input.nextInt();
        input.close();
        System.out.println("Area of Rectangle " + length*width);
    }
}
