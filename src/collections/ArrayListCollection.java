package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
//    ARRAY LIST PERMITE CREAR LISTAS DINAMICAS
//    los arrayList no permiten guardar tipos de datos primitivos para eso hay que usar una clase envoltoria


    public static void main(String[] args) {
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
//        podemos indicar una capacidad minima , por defecto es 10 , si se pasa por atras crea una copia para agregar un nuevo elemento , es una cuestion de performance
        listaEmpleados.ensureCapacity(15);
        listaEmpleados.add(new Empleado("facu", 32, 140000));
        listaEmpleados.add(new Empleado("facu", 32, 140000));
        listaEmpleados.add(new Empleado("ruben", 33, 170000));
        listaEmpleados.add(new Empleado("julieta", 28, 180000));



        listaEmpleados.set(1,new Empleado("olga",22,2200));
        System.out.println("listaEmpleados.get(3).getNombre() = " + listaEmpleados.get(2).getNombre());

//        podemos hacer una copia y pasarlo a un array con el metodo toArray()
        Empleado arrEmpleados[] = new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrEmpleados);

//        recorta la memoria libre que se utilizo a medida que fue creciendo el arrayList y se fue copiando en memoria
        listaEmpleados.trimToSize();

//        Iterador: es el encargado de recorrer elemento a elemento la coleccion, tiene los metodos next(). hasNext()

        Iterator<Empleado> miIterador = listaEmpleados.iterator();
        System.out.println(miIterador.next().getNombre());
        System.out.println(miIterador.hasNext());



        System.out.println("Podemos ver el size de la lista como el length es:  " + listaEmpleados.size());
    }
}
