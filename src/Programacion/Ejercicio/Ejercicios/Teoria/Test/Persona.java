package Programacion.Ejercicio.Ejercicios.Teoria.Test;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", dni, apellido, nombre, edad);
    }
}
