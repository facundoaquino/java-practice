package collections;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otro = (Libro) obj;
            if (this.ISBN == otro.ISBN) {
                return true;
            }
            return false;
        }
        return false;
    }

//    generalmente los ide tiene autogenerado de equals y hashCode

//    @Override
//    public int hashCode() {
//        return Objects.hash(titulo, autor, ISBN);
//    }
}
