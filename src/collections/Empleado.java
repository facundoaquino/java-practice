package collections;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleado empleado = (Empleado) o;

        if (edad != empleado.edad) return false;
        if (Float.compare(empleado.salario, salario) != 0) return false;
        return Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + edad;
        result = 31 * result + (salario != +0.0f ? Float.floatToIntBits(salario) : 0);
        return result;
    }
}
