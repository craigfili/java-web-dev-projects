package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        final double PI = 3.14159;
        double radius;
        double area;
        //

        System.out.println("Enter a number for the radius: ");
        radius = input.nextDouble();
//        area = PI * radius * radius;
        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
