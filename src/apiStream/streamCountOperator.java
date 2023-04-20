package apiStream;

import java.util.stream.Stream;

public class streamCountOperator {
    public static void main(String[] args) {

//        peek es un operador intermedio no terminal tiene fines de debug
        long counter = Stream.of("pepe", "Paco", "la", "fa", "esmeralda")
                .map(n -> n.toUpperCase())
                .filter(s -> s.length() > 3)
                .count();

        System.out.println("counter = " + counter);

    }
}
