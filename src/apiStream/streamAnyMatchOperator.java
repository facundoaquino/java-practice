package apiStream;

import java.util.stream.Stream;

public class streamAnyMatchOperator {
    public static void main(String[] args) {

//        peek es un operador intermedio no terminal tiene fines de debug
        Stream<String> names = Stream.of("pepe", "Paco", "lucia", "julieta", "facundo", "roberto");

        boolean existsName = names
                .anyMatch(s -> s.equals("pepe"));

        System.out.println("existsName = " + existsName);


    }
}
