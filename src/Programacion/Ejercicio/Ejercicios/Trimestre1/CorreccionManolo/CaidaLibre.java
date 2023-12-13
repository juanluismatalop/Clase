package Programacion.Ejercicio.Ejercicios.Trimestre1.CorreccionManolo;

import java.util.Scanner;
/*
Programa para el cálculo de las fórmulas de caida libre son:
t = Math.sqrt ( 2 · h / g)
v = Math.sqrt ( 2 · h · g)
Los valores de tipo t son short y v long
Se muestran los datos por consola.
 */
public class CaidaLibre {
    public static void main(String[] args) {
        final double GRAVEDAD = 9.8;
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Introduce la altura");
        int altura = sc.nextInt ();
        sc.close ();
        short tiempo   = (short) Math.sqrt ( 2 * altura / GRAVEDAD );
        long velocidad = (long) Math.sqrt ( 2 * altura * GRAVEDAD );
        System.out.printf ( "Un cuerpo que cae de desde %d metros tarda %d segundos en caer y " +
                "llega al suelo con una velocidad de %d m/s", altura, tiempo, velocidad);
    }
}