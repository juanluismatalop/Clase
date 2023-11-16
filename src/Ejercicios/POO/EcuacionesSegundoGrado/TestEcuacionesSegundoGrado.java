package Ejercicios.POO.EcuacionesSegundoGrado;

import java.util.Scanner;

public class TestEcuacionesSegundoGrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EcuacionesSegundoGrado ecuacionesSegundoGrado = new EcuacionesSegundoGrado();
        System.out.printf("Introduce los valores de la ecuacion de segundo grado%n");
        ecuacionesSegundoGrado.setA(scanner.nextInt());
        ecuacionesSegundoGrado.setB(scanner.nextInt());
        ecuacionesSegundoGrado.setC(scanner.nextInt());
        System.out.println(ecuacionesSegundoGrado.toString());
    }
}
