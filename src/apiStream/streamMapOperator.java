package apiStream;

import apiStream.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMapOperator {
    public static void main(String[] args) {

//        peek es un operador intermedio no terminal tiene fines de debug
        Stream<String> names = Stream.of("pedro", "pepe", "Paco")
                .peek(System.out::println)
                .map(n -> n.toUpperCase());

        names.forEach(System.out::println);

        List<String> namesList = names.collect(Collectors.toList());


        Stream<Usuario> names2 = Stream.of("pedro", "pepe", "Paco")
                .map(n -> new Usuario(n.toUpperCase(), null));

        List<Usuario> usersList = names2.collect(Collectors.toList());

        usersList.forEach(System.out::println);

    }
}
