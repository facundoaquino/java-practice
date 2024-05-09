package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamsPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 8, 1, 23, 312, 434, 565, 455, 334, 5435, 84824);
        int sum = numbers.stream().filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum = " + sum);

        List<String> strings = Arrays.asList("apple", "banana", "orange");
        long sumStringGreaterThanFiveCharacters = strings.stream().filter(s -> s.length() > 5)
                .count();
        System.out.println("sumStringGreaterThanFiveCharacters = " + sumStringGreaterThanFiveCharacters);

// Function that takes a list of integers as input and returns a new list containing the square of each element.
        Function<List<Integer>, List<Integer>> returnsSquears = integers -> integers.stream()
                .map(n -> (int) Math.pow(2,n))
                .collect(Collectors.toList());

        System.out.println("returnsSquears.apply(numbers) = " + returnsSquears.apply(numbers));

//        Find the maximum element in a list of integers.
        int max = numbers.stream().filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println("sum = " + max);
//ind Second Smallest Element in a List
        Optional<Integer> secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        System.out.println("secondSmallest = " + secondSmallest.get());
    }
}
