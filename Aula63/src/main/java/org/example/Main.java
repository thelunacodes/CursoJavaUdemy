package org.example;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
        System.out.println(OrderStatus.valueOf("DELIVERED"));
    }
}