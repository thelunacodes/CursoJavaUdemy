package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Account acc1 = new Account(1001, "Alex", 1000.0);
        //Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        //Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: R$ %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.00);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for the account %d: R$ %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}