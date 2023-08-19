package DessingPatterns.Creational.singleton;


//PARA GARANTIZAR LA CREACION Y USO DE UNA SOLA INSTANCIA DE UN OBJETO
public class SingletonPattern {

    public static void main(String[] args) {

        Version uniqueVersionInstance = Version.getInstance();

        System.out.println(uniqueVersionInstance);
    }
}
