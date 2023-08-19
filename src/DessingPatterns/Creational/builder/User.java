package DessingPatterns.Creational.builder;


import java.time.LocalDate;

public class User {
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final LocalDate fechaRegistro;

    public User(int id, String nombre, String apellido, String correo, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.correo = builder.correo;
        this.fechaRegistro = builder.fechaRegistro;
    }

    public static class Builder {
       private  int id;
       private  String nombre;
       private  String apellido;
       private  String correo;
       private  LocalDate fechaRegistro;

       public User.Builder setId(int id) {
           this.id = id;
           return this;
       }

       public User.Builder setNombre(String nombre) {
           this.nombre = nombre;
           return this;
       }

       public User.Builder setApellido(String apellido) {
           this.apellido = apellido;
           return this;
       }

       public User.Builder setCorreo(String correo) {
           this.correo = correo;
           return this;
       }

       public User.Builder setFechaRegistro(LocalDate fechaRegistro) {
           this.fechaRegistro = fechaRegistro;
           return this;
       }

       public User build() {
            return new User(this);
       }
   }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}