package FunctionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class FuncionExample {

    public static void main(String[] args) {

//        Function es una combinacion entre el Consumer y el Supplier
        Function<String, String> f1 = param -> "Hello here! " + param;
        String result = f1.apply("here");
        System.out.println("result = " + result);

//        para 2 argumentos y un retorno ver BiFunction


        Function<String, Integer> myFunction = param -> FuncionExample.multiplyWord(param);

        System.out.println(myFunction.apply("pepernatol"));

        Map<String, Function<String, Integer>> myFunctionMap = new HashMap<>();
        myFunctionMap.put("*", str -> FuncionExample.multiplyWord(str));
        myFunctionMap.put("+", FuncionExample::addWord);

        System.out.println(myFunctionMap.get("+").apply("casa"));


    }
    public static int multiplyWord(String word) {
        return 10 * word.length();
    }
    public static int addWord(String word) {
        return 10 + word.length();
    }

}
