package Programacion.Ejercicio.Ejercicios.Teoria.POO.Persona;

public class Persona {
    private String nombreCompeeto;
    private int edad;

    public Persona() {
        this.nombreCompeeto = nombreCompeeto;
        this.edad = edad;
    }

    public String getNombreCompeeto() {
        return nombreCompeeto;
    }

    public void setNombreCompeeto(String nombreCompeeto) {
        this.nombreCompeeto = nombreCompeeto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%S: %d%n",
                nombreCompeeto, edad);
    }
}
