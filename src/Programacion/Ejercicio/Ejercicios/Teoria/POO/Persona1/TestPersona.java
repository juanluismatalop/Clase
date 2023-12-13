package Programacion.Ejercicio.Ejercicios.Teoria.POO.Persona1;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(15, 42);
        System.out.println(persona1);
        System.out.printf("PERSONA con edad %d y peso %.3f%n", persona1.edad(), persona1.peso());
    }
}
