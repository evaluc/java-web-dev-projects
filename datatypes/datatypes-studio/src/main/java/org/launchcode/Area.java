package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double radius;
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        while (radius <= 0) {
            System.out.println("ERROR: Please enter a positive radius: ");
            radius = input.nextDouble();
        }

        double area = Circle.getArea(radius);
           System.out.println(area);
           input.close();
        }
    }

