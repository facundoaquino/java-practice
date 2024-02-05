package DateType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateType {
/*
*
* En Java, el manejo de tipos de dato Date se realiza utilizando la clase java.util.Date. Sin embargo, a partir de Java 8,
*  se recomienda utilizar la API de fecha
*  y hora mejorada, que incluye las clases java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime, entre otras.*/
    public static void main(String[] args) {

        Date newDate = new Date();

        System.out.println(newDate);

        System.out.println("newDate. = " + newDate.getDay());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.getDayOfMonth());

        System.out.println(localDateTime.plusDays(3));


//        LOCAL DATE

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

    }
}
