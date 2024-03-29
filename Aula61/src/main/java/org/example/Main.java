package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 =  new Date();
        System.out.println("x1: " + x1);

        Date x2 = new Date(System.currentTimeMillis());
        System.out.println( "x2: " + x2);

        Date x3 = new Date(0L); //0 milissegundos
        System.out.println("x3: " + x3);

        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println("x4: " + x4);

        Date x5 = new Date(2010-1900,02,22);
        System.out.println("x5: " + x5);

        Date y1 = sdf1.parse("21/12/1965");
        System.out.println("y1: " + y1);

        Date y2 = sdf2.parse("22/03/2003 04:20:00");
        System.out.println("y2: " + y2);

        System.out.println("y1 (sdf2 format): " + sdf2.format(y1));
        System.out.println("y2 (sdf1 format): " + sdf1.format(y2));

        Date y3 = Date.from(Instant.parse("2024-02-22T17:18:20Z"));
        System.out.println("y3: " + sdf3.format(y3));
    }
}