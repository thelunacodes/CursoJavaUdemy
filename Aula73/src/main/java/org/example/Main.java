package org.example;

import org.example.enums.Color;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfShapes;
        String shapeType;
        Color shapeColor;
        double shapeWidth;
        double shapeHeight;
        double shapeRadius;

        List<Shape> shapes = new ArrayList<>();

        //Number of shapes input
        do {
            try {
                System.out.print("Enter the number of shapes: ");
                numOfShapes = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ONLY NUMBERS PLEASE.");
                sc.nextLine();
            }
        } while (true);
        sc.nextLine();
        //Shape data input
        for (int i = 0; i < numOfShapes; i++) {
            System.out.printf("Shape #%d data:%n", i+1);
            //Rectangle or circle
            do {
                System.out.print("Rectangle or Circle (r/c) ");
                shapeType = sc.nextLine();
                if (shapeType.strip().equalsIgnoreCase("r") || shapeType.strip().equalsIgnoreCase("c")) {
                    break;
                } else {
                    System.out.println("PLEASE, ENTER \"C\" OR \"R\".");
                }
            } while (true);
            //Color
            do {
                try {
                    System.out.print("Color (BLACK/BLUE/RED): ");
                    shapeColor = Color.valueOf(sc.nextLine().toUpperCase());
                    break;
                }catch (IllegalArgumentException e) {
                    System.out.println("INVALID COLOR. ENTER ONLY \"RED\", \"BLUE\" OR \"BLACK\"");
                }
            } while (true);
            //Rectangle input
            if (shapeType.strip().equalsIgnoreCase("r")) {
                //Width
                do {
                    try {
                        System.out.print("Width: ");
                        shapeWidth = Double.parseDouble(sc.nextLine().replace(",","."));;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("ONLY DECIMAL NUMBERS, PLEASE.");
                    }
                } while (true);
                //Height
                do {
                    try {
                        System.out.print("Height: ");
                        shapeHeight = Double.parseDouble(sc.nextLine().replace(",","."));;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("ONLY DECIMAL NUMBERS, PLEASE.");
                    }
                } while (true);
                shapes.add(new Rectangle(shapeColor, shapeWidth, shapeHeight));
            //Circle input
            } else if (shapeType.strip().equalsIgnoreCase("c")) {
                //Radius
                do {
                    try {
                        System.out.print("Radius: ");
                        shapeRadius = Double.parseDouble(sc.nextLine().replace(",","."));
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("ONLY DECIMAL NUMBERS, PLEASE.");
                    }
                } while (true);
                shapes.add(new Circle(shapeColor, shapeRadius));
            }
        }
        //Shape Areas
        System.out.println("\nSHAPE AREAS:");
        for (Shape s : shapes) {
            System.out.printf("%.2f%n", s.area());
        }
        sc.close();
    }
}