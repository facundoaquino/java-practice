package collections;

import java.util.ArrayList;

public class ArrayListCollection {
//    ARRAY LIST PERMITE CREAR LISTAS DINAMICAS
//    los arrayList no permiten guardar tipos de datos primitivos para eso hay que usar una clase envoltoria


    public static void main(String[] args) {
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
//        podemos indicar una capacidad minima , por defecto es 10 , si se pasa por atras crea una copia para agregar un nuevo elemento , es una cuestion de performance
        listaEmpleados.ensureCapacity(15);
        listaEmpleados.add(new Empleado("facu", 32, 140000));
        listaEmpleados.add(new Empleado("ruben", 33, 170000));
        listaEmpleados.add(new Empleado("julieta", 28, 180000));

        System.out.println("Podemos ver el size de la lista como el length es:  " + listaEmpleados.size());
    }
}
