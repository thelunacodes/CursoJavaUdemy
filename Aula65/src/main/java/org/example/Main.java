package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",dtf),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12,
                new ArrayList<>());
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1.toString());;

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19",dtf),
                "Good night guys",
                "See you tomorrow",
                5,
                new ArrayList<>());
        p2.addComment(c3);
        p2.addComment(c4);
        System.out.println(p2.toString());
    }
}