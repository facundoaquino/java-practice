package Generics.classes;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("peregrino", "caballo"));
        transporteCaballos.add(new Animal("persa", "caballo"));

        for(Animal a: transporteCaballos){
            System.out.println(a.getNombre() + " " + a.getTipo());
        }


        Camion transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("bulldozer"));
        transMaquinas.add(new Maquinaria("Perforadora"));


    }
}
