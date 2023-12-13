package Programacion.Ejercicio.Ejercicios.Teoria.POO.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombreCompeeto("Juan Luis Mata");
        persona.setEdad(25);
        System.out.printf(persona.toString());
    }
}
