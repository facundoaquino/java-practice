package apiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamExample {
    public static void main(String[] args) {
//        creacion de stream
        Stream<String> names = Stream.of("pedro", "pepe", "Paco");

        names.forEach(e -> System.out.println(e));


        String[] strArr = {"pedro", "pepe", "Paco"};
        Stream<String> names2 = Arrays.stream(strArr);

        Stream<String> names3 = Stream.<String>builder()
                .add("pepe")
                .add("lucio")
                .build();

//        CONVERTIR UNA LISTA A STREAM

        List<String> namesList = new ArrayList<>();
        namesList.add("maria");
        namesList.add("jose");
        namesList.add("diego");

        Stream<String> names4 = namesList.stream();
    }
}
