package collections;

public class equalsHashCode {
    public static void main(String[] args) {
        Libro libro1 = new Libro("papa", "facu", 123);
        Libro libro2 = new Libro("papa", "facu", 123);

//        tenemos que rescribir el metodo equals en la clase libro
        if(libro1.equals(libro2)){
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }
    }
}
