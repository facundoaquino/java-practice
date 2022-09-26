package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsJavaBounded {
    //introduced jdk 5
    public static void main(String[] args) {


        List<String> nombres = fromArrayToList(new String[]{"name","name2","name3"}, 32);
        nombres.forEach(System.out::println);
    }


//


//    podemos limitar tipo de dato y hacer sobrecarga tambien
    public static <T, G extends  Number> List<T> fromArrayToList(T[] c, G g ){
        System.out.println("g = " + g);
        return Arrays.asList(c);
    }




}
