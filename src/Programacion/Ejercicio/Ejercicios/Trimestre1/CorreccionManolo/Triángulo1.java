package Programacion.Ejercicio.Ejercicios.Trimestre1.CorreccionManolo;

public class Triángulo1 {
    public static void main(String[] args) {
        //calculamos aleatoriamente dos ángulos
        int angulo1 = new java.util.Random().nextInt(180) + 1;
        int angulo2 = new java.util.Random().nextInt(180) + 1;
        //obtenemos el ángulo que falta
        int angulo3 = 180 - angulo1 - angulo2;
        //si NO superamos 180º entre los angulo1 y angulo2 se puede formar
        if (angulo1 + angulo2 < 180) {
            System.out.printf ( "Ángulo 1: %d, ángulo 2: %d y ángulo 3: %d%n", angulo1, angulo2, angulo3 );
        } else {
            System.out.printf ( "Con los ángulos %d y %d no se puede formar un trı́angulo%n", angulo1, angulo2 );
        }

    }

}
