package Examenes23_24.Trimestre1.CorreccionManolo;

import java.util.Scanner;

public class Triangulo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        float angulo1 = 0, angulo2 = 0;
        do {
            System.out.println ("Introduce el valor de un ángulo");
            angulo1 = sc.nextFloat ();
            System.out.println ("Introduce el valor del segundo ángulo");
            angulo2 = sc.nextFloat ();
        } while (angulo1 + angulo2 >= 180); //se repite el bucle hasta que se pueda formar el triángulo
        sc.close ();
        float angulo3 = 180 - angulo1 - angulo2;
        System.out.printf ( "Ángulo 1: %.2f, ángulo 2: %.2f y ángulo 3: %.2f%n", angulo1, angulo2, angulo3 );
    }
}
