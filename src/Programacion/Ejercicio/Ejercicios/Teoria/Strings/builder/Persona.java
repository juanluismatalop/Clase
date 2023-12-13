package Programacion.Ejercicio.Ejercicios.Teoria.Strings.builder;

public class Persona {
    private String apellidos;
    private String nombres;
    private  String dni;
    private int edad;

    public Persona(String apellidos, String nombres, String dni, int edad) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(dni).append(',').append(apellidos).append(',').append(nombres).append(',').append(edad);
        //return String.format("%s, %s, %s, %d", nombres, apellidos, dni, edad);
        return builder.toString();
    }
}
