package Interfaces;

public interface Auto {

//    a partir de java 8 se pueden hacer interfaces con metodos por defecto y estaticos


    default void bocina (){
        System.out.println("pi pi");
    }

    static String consumo(int motor) {
        return String.valueOf(motor * 1000);
    }
}
