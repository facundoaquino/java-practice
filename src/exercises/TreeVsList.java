package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * tree sorted is more efficient for serach than list estructure
 *
 *
 * **/

public class TreeVsList {
    public static void main(String[] args) {


        TreeSet<Integer> treeOfIntergers = new TreeSet<>();
        List<Integer> listOfIntergers = new ArrayList<>();

        long startProcess = System.currentTimeMillis();
        Stream.iterate(0, integer -> integer + 1)
                .limit(10000000)
                .forEach(integer -> {
                    treeOfIntergers.add(integer);
                    listOfIntergers.add(integer);
                });

        float totalProcess = (float) (System.currentTimeMillis() - startProcess) / 1000;
        System.out.println("process time: " + totalProcess);


        long startProcessList = System.currentTimeMillis();
        listOfIntergers.contains(9999999);
        float totalProcessList = (float) (System.currentTimeMillis() - startProcessList) / 1000;
        System.out.println("process time list: " + totalProcessList);


        long startProcessTree = System.currentTimeMillis();
        treeOfIntergers.contains(99999999);
        float totalProcessTree = (float) (System.currentTimeMillis() - startProcessTree) / 1000;
        System.out.println("process time tree: " + totalProcessTree);
        System.out.println("tree size = " + treeOfIntergers.size());

    }
}
