package FunctionalProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> testPredicate = num -> num > 10;
        boolean boo = testPredicate.test(11);
        System.out.println("boo = " + boo);

//        para mandar 2 argumentos ver BiPredicate
    }
}
