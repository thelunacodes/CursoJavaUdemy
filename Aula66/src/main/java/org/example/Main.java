package org.example;

import entity.enums.OrderStatus;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //Variables
        String clientName = "";
        String clientEmail = "";
        LocalDate clientBirthdate = LocalDate.now();
        OrderStatus orderStatus = OrderStatus.PROCESSING;
        Integer numberOfItems = 0;
        String productName = "";
        Double productPrice = 0.0;
        Integer productQuantity = 0;
        Product product = new Product();
        List<OrderItem> items = new ArrayList<>();
        Double totalPrice = 0.0;

        //CLIENT DATA
        System.out.println("Enter client data:");
        //Name
        System.out.print("Name: ");
        clientName = sc.nextLine();
        //Email
        System.out.print("Email: ");
        clientEmail = sc.nextLine();
        //Birthdate
        do {
            try {
                System.out.print("Birthdate (DD/MM/YYYY): ");
                clientBirthdate = LocalDate.parse(sc.nextLine(), dtf);
                LocalDate currentDate = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
                if (currentDate.getYear() - 18 < clientBirthdate.getYear()) {
                    //Check if user is underage
                    System.out.println("YOU HAVE TO BE, AT LEAST, 18 YEARS OLD!");
                    System.exit(0);
                } else if (currentDate.getYear() < clientBirthdate.getYear()) {
                    //Check if date is valid
                    System.out.println("INVALID YEAR.");
                } else {
                    break;
                }
            } catch (DateTimeException e) {
                System.out.println("INVALID BIRTHDATE.");
            }
        } while (true);
        //Create "Client" instance
        Client c = new Client(clientName, clientEmail, clientBirthdate);
        //ORDER DATA
        System.out.println("Order Data: ");
        //Status
        do {
            try {
                System.out.print("Status: ");
                orderStatus = OrderStatus.valueOf(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("INVALID ORDER STATUS");
            }
        } while (true);
        //How many items to this order
        do {
            try {
                System.out.print("How many items to this order? ");
                numberOfItems = sc.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.println("INVALID NUMBER");
                sc.nextLine();
            }
        } while (true);
        sc.nextLine();
        //Orders
        for (int i = 0; i < numberOfItems; i++) {
            //ITEM #N DATA
            System.out.println(String.format("Enter #%d item data: ", i+1));
            //Product name
            System.out.print("Product name: ");
            productName = sc.nextLine();
            //Product price
            do {
                try {
                    System.out.print("Product price: ");
                    productPrice = sc.nextDouble();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("INVALID INPUT");
                    sc.nextLine();
                }
            } while (true);
            sc.nextLine();
            //Product quantity
            do {
                try {
                    System.out.print("Quantity: ");
                    productQuantity = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("INVALID INPUT");
                    sc.nextLine();
                }
            } while (true);
            sc.nextLine();
            //Add product to product list
            product = new Product(productName, productPrice);
            OrderItem oi = new OrderItem(productQuantity, product.getPrice(), product);
            items.add(oi);
        }
        Order order = new Order(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()), orderStatus, items);
        //ORDER SUMMARY
        System.out.println("\nORDER SUMMARY: ");
        //Order moment
        System.out.println("Order moment: " + dtf2.format(order.getMoment()));
        //Order status
        System.out.println("Order status: " + order.getStatus());
        //Cliente
        System.out.println("Client: " + c.getName() + " (" + c.getBirthDate() + ") - " + c.getEmail());
        //Order items list
        System.out.println("Order Items: ");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getProduct().getName() + ", $" + String.format("%.2f", item.getPrice()) + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + String.format("%.2f", item.subTotal()));
            totalPrice += item.subTotal();
        }
        System.out.println(String.format("Total price: $%.2f", totalPrice));
    }
}