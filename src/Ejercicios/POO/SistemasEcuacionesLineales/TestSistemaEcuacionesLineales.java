package Ejercicios.POO.SistemasEcuacionesLineales;

import java.util.Scanner;

public class TestSistemaEcuacionesLineales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduce las variables:%n");
        SistemaEcuacionesLineales e1 = new SistemaEcuacionesLineales(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (!e1.VerSiTienenSolucion())
            System.out.printf("No tiene soluciones%n");
        else {
            System.out.println(e1);
            System.out.printf("X = %.2f%nY = %.2f%n", e1.CalcularX(), e1.CalcularY());
        }
    }
}
