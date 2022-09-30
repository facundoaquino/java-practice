package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
//        declaration

        int[] numbers;

        //0 is the default value for the initialization array if were an object null would be the default value
        int[] numbers2 = new int[10];


        int[] numbers3 = {1, 2, 3, 4, 5, 23, 12, 43, 54, 655};


//        FOR EACH
        for (int num : numbers3) {
            System.out.println("num = " + num);
        }

//        SORT

        String   products []  = {"abuelo","maria","edificio"};
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println("products = " + products[i]);
        }

        for(String prod : products){
            System.out.println("prod = " + prod);
        }


//        gert inverse array with Collection.reverse

        Collections.reverse(Arrays.asList(products));

        for(String prod : products){
            System.out.println("prod = " + prod);
        }


    }
}
