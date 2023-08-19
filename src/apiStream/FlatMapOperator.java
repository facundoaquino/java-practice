package apiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperator {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Lista 1
        List<Integer> list1 = Arrays.asList(23, 45, 12, 87, 9);
        listOfLists.add(list1);

        // Lista 2
        List<Integer> list2 = Arrays.asList(56, 34, 78, 2, 50, 91);
        listOfLists.add(list2);

        // Lista 3
        List<Integer> list3 = Arrays.asList(15, 88, 3, 67, 22);
        listOfLists.add(list3);

        List<Integer> flatInteger = listOfLists.stream()
                .flatMap(Collection::stream)
                .map(num -> num +10 )
                .collect(Collectors.toList());

        System.out.println(flatInteger);

    }
}
