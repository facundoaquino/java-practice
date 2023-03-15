package FunctionalProgramming;

import java.util.function.Function;

public class FuncionExample {

    public static void main(String[] args) {

//        Function es una combinacion entre el Consumer y el Supplier
        Function<String, String> f1 = param -> "Hello here! " + param;
        String result = f1.apply("here");
        System.out.println("result = " + result);

//        para 2 argumentos y un retorno ver BiFunction
    }
}
