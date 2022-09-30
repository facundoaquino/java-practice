package Generics.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//cualquier objeto que implemente Iterable se puede iterar con un forEach
public class Camion<T> implements Iterable<T>{
    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add( T objeto){
        this.objetos.add(objeto);
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
