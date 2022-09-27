package collections;

import AppFacturas.modelo.Cliente;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
       Empleado c1 = new Empleado("facu", 32, 140000);
       Empleado c2 = new Empleado("facu", 32, 140000);
       Empleado c3 = new Empleado("ruben", 33, 170000);
       Empleado c4 = new Empleado("julieta", 28, 180000);

//Esta es una buena práctica programar siempre orientado a interfaces y no a sus implementaciones concretas.

//        El metodo add ya evalua si el objeto existe o no y no lo agrega HashSet no admite duplicados
        Set<Empleado> empleadosBanco = new HashSet<Empleado>();
        empleadosBanco.add(c1);
        empleadosBanco.add(c2);
        empleadosBanco.add(c3);
        empleadosBanco.add(c4);
        empleadosBanco.add(c4);
        empleadosBanco.add(c4);
        empleadosBanco.add(c4);

        for (Empleado e: empleadosBanco
             ) {
            System.out.println("e.getNombre() = " + e.getNombre());
            System.out.println("e.hashCode() = " + e.hashCode());
        }
    }
}
