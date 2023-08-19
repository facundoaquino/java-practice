package DessingPatterns.Creational.builder;

import java.time.LocalDate;


//PERMITE LA CREACION DE OBJETOS COMPLEJOS PASO A PASO
public class BuilderPattern {

    public static void main(String[] args) {


//        una forma de construir un user
        User newUser = new User(1, "John", "Doe", "john@example.com", LocalDate.of(2023, 8, 19));
        System.out.println(newUser);

        User userBuilder = new User.Builder()
                .setApellido("perez")
                .build();
        System.out.println(userBuilder);

    }
}
