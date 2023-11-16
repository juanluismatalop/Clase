package Examenes23_24.Trimestre1;
/*Enunciado
4. Usando Geany crea un programa para calcular el tiempo de caida libre y la velocidad con que un objeto
llega al suelo
Las f´ormulas de caida libre son:
    t = √2h/g
    v = √2hg
D´onde:
    • t es el tiempo que tarda el cuerpo en caer.
    • h es la altura que cae.
    • g es la constante de la gravedad y vale 9.8.
    • v es la velocidad con la que llega al suelo.
    • Crea un programa, que solicite por Scanner el valor de la altura con al que cae un cuerpo, dicha
    variable ser´a entera.
    • Calcula el tiempo usando una variable de tipo entero, en este caso de tipo short y usando el
    correspondiente casting
    • Calcula la velocidad usando una variable de tipo entero, en este caso de tipo long y usando el
    correspondiente casting
    • Muestra los resultados en consola usando un printf, ejemplo:
        Un cuerpo que cae de desde 22 metros tarda 2 segundos en caer y llega al suelo
        con una velocidad de 20 m/s
    • Crea un comentario de bloque al inicio de la clase que explique que es lo que hace el programa.
    • El programa es ejecutable.
 */
/*
 * Nombre y apellidos : Juan Luis Mata López
 * Nombre del programa : caidaLibre.java
 * Version : 1.0
 * Fecha : 16/11/23
 */
import java.util.Scanner;
public class caidaLibre {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double G = 9.8;
        //te pide la altura
        System.out.printf("Introduce la altura:%n");
        int h = scanner.nextInt();
        //calculo de el tiempo t y la velocidad v
        short t = (short) Math.sqrt((2*h)/G);
        long v = (long) Math.sqrt(2*h*G);
        //muestra la solucion del problema
        System.out.printf("Un cuerpo que cae de desde %d metros tarda %d segundos en caer y llega al suelo con una velocidad de %d m/s%n", h, t, v);
    }
}
