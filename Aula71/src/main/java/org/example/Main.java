package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEmployees;
        String outsourced;
        String employeeName;
        int employeeHours;
        double employeeValuePerHour;
        double employeeAditionalCharge = 0.0;
        List<Employee> employees = new ArrayList<>();

        //Number fo employees
        do {
            try {
                System.out.print("Enter number of employees: ");
                numOfEmployees = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("INVALID NUMBER.");
                sc.nextLine();
            }
        } while (true);
        sc.nextLine();
        //Employees
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            //Outsourced (or not)
            do {
                System.out.print("Outsourced (\"y\"/\"n\")? ");
                outsourced = sc.nextLine();
                if (outsourced.strip().equalsIgnoreCase("y") || outsourced.strip().equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("PLEASE, ENTER ONLY \"y\" OR \"n\".");
                }
            } while (true);
            //Name of the employee
            System.out.print("Name: ");
            employeeName = sc.nextLine().strip();
            //Number of hours
            do {
                try {
                    System.out.print("Hours: ");
                    employeeHours = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("INVALID HOUR.");
                    sc.nextLine();
                }
            } while (true);
            sc.nextLine();
            //Value per hour
            do {
                try {
                    System.out.print("Value per hour: ");
                    employeeValuePerHour = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("INVALID VALUE PER HOUR. PLEASE, USE \",\" INSTEAD OF \".\".");
                    sc.nextLine();
                }
            } while (true);
            sc.nextLine();
            //Additional charge (optional)
            if (outsourced.strip().equalsIgnoreCase("y")) {
                do {
                    try {
                        System.out.print("Additional charge: ");
                        employeeAditionalCharge = sc.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("INVALID ADDITIONAL CHARGE. PLEASE, USE \",\" INSTEAD OF \".\".");
                        sc.nextLine();
                    }
                } while (true);
                sc.nextLine();
            }
            if (outsourced.strip().equalsIgnoreCase("y")) {
                employees.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour, employeeAditionalCharge));
            } else {
                employees.add(new Employee(employeeName, employeeHours, employeeValuePerHour));
            }
        }
        System.out.println("\nPAYMENTS: ");
        for (Employee emp : employees) {
            System.out.println(String.format("%s - $ %.2f", emp.getName(), emp.payment()));
        }
        sc.close();
    }
}