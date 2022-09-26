package Generics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsJava {
    //introduced jdk 5
    public static void main(String[] args) {
        List<String> clientes = new ArrayList();
        clientes.add("some string");
        clientes.add("some string 1");
        clientes.add("some string 2");
        System.out.println("clientes = " + clientes);
        System.out.println("clientes = " + clientes.get(2));


        List<String> nombres = fromArrayToList(new String[]{"name","name2","name3"}, 32);
        nombres.forEach(System.out::println);
    }


//
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

//    podemos tener mas de un parametro generico
    public static <T, G> List<T> fromArrayToList(T[] c, G g ){
        System.out.println("g = " + g);
        return Arrays.asList(c);
    }
}
