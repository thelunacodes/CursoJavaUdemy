package org.example;

import entity.enums.WorkerLevel;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        String department = "";
        String workerName = "";
        WorkerLevel workerLevel = WorkerLevel.SENIOR;
        double workerBaseSalary = 0.0;
        ArrayList<HourContract> contractList = new ArrayList<>();
        int numberOfContracts = 0;
        LocalDate contractDate = LocalDate.now();
        double contractValuePerHour = 0.0;
        int contractDurationHours = 0;
        YearMonth monthYearIncome = YearMonth.now();

        //DEPARTMENT'S NAME
        System.out.print("Enter department's name: ");
        department = (sc.nextLine().strip().toLowerCase());
        department = department.substring(0, 1).toUpperCase() + department.substring(1);
        System.out.println(department);
        System.out.println("Enter worker's data: ");
        //WORKER NAME
        System.out.print("Name: ");
        workerName = sc.nextLine();
        //WORKER LEVEL
        do {
            try {
                System.out.print("Level (JUNIOR, MID_LEVEL or SENIOR): ");
                workerLevel = WorkerLevel.valueOf(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("INVALID WORKER LEVEL");
            }
        } while (true);
        //BASE SALARY
        do {
            try {
                System.out.print("Base salary: ");
                workerBaseSalary = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT (ENTER DECIMALS USING \",\"");
                sc.nextLine();
            }
        } while (true);
        //HOW MANY CONTRACTS
        do {
            try {
                System.out.print("How many contracts: ");
                numberOfContracts = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT");
                sc.nextLine();
            }
        } while (true);
        sc.nextLine();
        //CREATING THE CONTRACT(S)
        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data: ");
            //CONTRACT DATE
            do {
                try {
                    System.out.print("Date (DD/MM/YYYY): ");
                    contractDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    break;
                } catch (DateTimeException e) {
                    System.out.println("INVALID DATE");
                    sc.nextLine();
                }
            } while (true);
            //VALUE PER HOUR
            do {
                try {
                    System.out.print("Value per hour: ");
                    contractValuePerHour = sc.nextDouble();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("INVALID INPUT (ENTER DECIMALS USING \",\"");
                    sc.nextLine();
                }
            } while (true);
            //DURATION (HOURS)
            do {
                try {
                    System.out.print("Duration (hours): ");
                    contractDurationHours = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("INVALID INPUT");
                    sc.nextLine();
                }
            } while (true);
            sc.nextLine();
            contractList.add(new HourContract(contractDate, contractValuePerHour, contractDurationHours));
        }

        //CREATE WORKER OBJECT
        Worker w = new Worker(workerName, workerLevel, workerBaseSalary, contractList);

        //INCOME CALCULATION
        do {
            try {
                System.out.print("Enter month and year to calculate income (MM/YYYY): ");
                monthYearIncome = YearMonth.parse(sc.nextLine(), DateTimeFormatter.ofPattern("MM/yyyy"));
                break;
            } catch (DateTimeException e) {
                System.out.println("INVALID MONTH/YEAR");
                sc.nextLine();
            }
        } while (true);
        System.out.println("Name: " + w.getName());
        System.out.println("Department: " + department);
        System.out.println("Income for " + monthYearIncome.getMonth().getValue() + "/" + monthYearIncome.getYear() + ": " + w.income(monthYearIncome.getYear(), monthYearIncome.getMonth().getValue()));
        sc.close();
    }
}