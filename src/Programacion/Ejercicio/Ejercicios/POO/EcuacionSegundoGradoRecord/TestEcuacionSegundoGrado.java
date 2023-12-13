package Programacion.Ejercicio.Ejercicios.POO.EcuacionSegundoGradoRecord;

import java.util.Scanner;

public class TestEcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EcuacionSegundoGrado ecuacionSegundoGrado = new EcuacionSegundoGrado(2, 3, -5);
        System.out.println(ecuacionSegundoGrado.toString());
        if ( !ecuacionSegundoGrado.EsResoluble())
            System.out.printf("No tiene posible soluciones");
        else
            System.out.println(ecuacionSegundoGrado);
            System.out.printf("Sus soluciones son%nx = %.2f%nx = %.2f", ecuacionSegundoGrado.calcularX1(), ecuacionSegundoGrado.calcularX2());
    }
}
