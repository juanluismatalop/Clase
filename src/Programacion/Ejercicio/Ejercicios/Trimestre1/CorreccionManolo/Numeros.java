package Programacion.Ejercicio.Ejercicios.Trimestre1.CorreccionManolo;

import java.util.Scanner;
/*
Programa que solicita tres números y
despliega un menú para calcular:
Valor medio
Mayor valor
Menor valor
Los resultados se calculan en métodos aparte
 */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Introduce un número");
        int numero1 = sc.nextInt ();
        System.out.println ("Introduce un número");
        int numero2 = sc.nextInt ();
        System.out.println ("Introduce un número");
        int numero3 = sc.nextInt ();
        int opcion = 0;
        String menu = """
                1. Calcular el valor medio.
                2. Obtener el mayor valor.
                3. Obtener el menor valor.
                4. Salir
                INTRODUCE OPCIÓN:
        """;
        do {
            System.out.println ( menu );
            opcion = sc.nextInt ();
            switch (opcion) {
                case 1 -> System.out.printf ( "Valor medio %.2f%n",
                        calcularValorMedio ( numero1, numero2, numero3 ) );
                case 2 -> System.out.printf ( "Mayor valor %d%n",
                        obtenerMayorValor ( numero1, numero2, numero3 ) );
                case 3 -> System.out.printf ( "Menor valor %d%n",
                        obtenerMenorValor ( numero1, numero2, numero3 ) );
                case 4 -> {
                    System.out.println ( "\nFIN DEL PROGRAMAN" );
                    sc.close ();
                    System.exit ( 0 ); //salimos del programa
                }
            }
        } while (opcion >= 1 || opcion <= 4) ;


    }
    //método que dado tres nº enteros y devuelve el valor medio
    private static float calcularValorMedio(int numero1, int numero2, int numero3) {
        return (numero1 + numero2 + numero3) / 3.0F;
    }
    //método que dado tres números, devuelve el mayor de ellos
    private static int obtenerMayorValor(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3)
            return numero1;
        if (numero2 > numero1 && numero2 > numero3)
            return numero2;
        return numero3;
    }
    //método que dado tres números, devuelve el menor de ellos
    private static int obtenerMenorValor(int numero1, int numero2, int numero3) {
        if (numero1 < numero2 && numero1 < numero3)
            return numero1;
        if (numero2 < numero1 && numero2 < numero3)
            return numero2;
        return numero3;
    }
}