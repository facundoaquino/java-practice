package apiStream;

import apiStream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamFilterOperator {
    public static void main(String[] args) {

//        peek es un operador intermedio no terminal tiene fines de debug
        Stream<String> names = Stream.of("pepe", "Paco")
                .map(n -> n.toUpperCase())
                .filter(s -> s.equals("PEPE"));

        names.forEach(System.out::println);

    }
}
