package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {

//        interface funcional
        Consumer<String> consumer = saludo -> System.out.println(saludo);

        consumer.accept("Helo world");

//        para dos parametros ver BiConsumer<>

//        usando referencia de metodo
        Consumer<Integer> consumer2 = System.out::println;
        consumer2.accept(2);

        List<String> listNames = Arrays.asList("Larry", "Moe");
        listNames.forEach(consumer);

//        supplier o provedor no recibe ningun argumento pero devuelve algo
        Supplier<String> provedor = () -> {
            return "Hello Supplier";
        };

        System.out.println(provedor.get());

    }
}
