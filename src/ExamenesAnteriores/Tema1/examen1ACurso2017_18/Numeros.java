package ExamenesAnteriores.Tema1.examen1ACurso2017_18;
/*
1.Realiza el siguiente programa de c´alculo num´erico -denominado Numero.java-
en el cual el programa reciba por argumentos un n´umero entero. Dicho argumento debera
pasarse a tipo int usando la clase Integer.
- Se debe comprobar que dicho n´umero es mayor que cuatro y menor de 1000. En caso
  contrario el programa terminar´a indicando en pantalla que el n´umero introducido
  no es valido.
- Se comprobaria si dicho numero es par o impar, mostrando en consola dicha afirmacion.
- Se comprobaria si es multiplo de tres y cinco a la vez, e igual que antes mostraremos
  dicha afirmacion.
- Nos diga cuantos d´ıgitos tiene, para esto puede usar m´etodos de la clase String o
  bien usar cualquier algoritmo que se te ocurra. Tienes que mostrar dicho resultado
  en pantalla
 */
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del numero");
        int numero = scanner.nextInt();
        if(numero>4)
            System.out.println("El numero " + numero + " es mayor que cuatro");
        else
            System.out.println("El numero " + numero + " NO es mayor que cuatro");
        if(numero<1000)
            System.out.println("Y es menor que 1000");
        else
            System.out.println("Y NO es menor que 1000");
        if(numero%2 == 0)
            System.out.println("Tambien sabemos que es un par");
        else
            System.out.println("Tambien sabemos que es un impar");
        if (numero%3 == 0 && numero%5 == 0)
            System.out.println("Nuestro numero es divisible entre 3 y 5");
        else if (numero%3 != 0 && numero%5 == 0)
            System.out.println("Nuestro numero es divisible entre 5 pero no de 3");
        else if (numero%3 == 0 && numero%5 != 0)
            System.out.println("Nuestro numero es divisible entre 3 pero no de 5");
        else
            System.out.println("Nuestro numero no es divisible entre 3 ni entre 5");

    }
}
