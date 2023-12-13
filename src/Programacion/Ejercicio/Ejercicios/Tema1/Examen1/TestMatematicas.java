package Programacion.Ejercicio.Ejercicios.Tema1.Examen1;

import java.util.Scanner;

/*
3. Crea dos clases, una llamada Matematicas.java y otra TestMatematicas.java, teniendo en cuenta lo
siguiente:
• En la clase Matematicas crea los siguientes m´etodos est´aticos:
– Un m´etodo llamado devolverMedia que recibe dos n´umeros enteros y devuelve el valor medio
como double
– Un m´etodo llamado devolverMayorValor que recibe dos n´umeros enteros y devuelve el valor
mas grande de los dos.
– Un m´etodo llamado devolverMenorValor que recibe dos n´umeros enteros y devuelve el valor
m´as peque˜no de los dos.
– Crea documentaci´on de la clase y los m´etodos, incorporando las etiquetas autor y versi´on.
• En la clase TestMatematicas.java realiza las siguientes acciones:
– Solicite mediante Scanner dos n´umeros enteros, comprendidos entre 0 y 10, solo se aceptan
esos datos, si se introduce un valor fuera de ese margen, se vuelve a solicitar.
– Despliegue un men´u con las siguientes opciones:
1. Calcular el valor medio.
2. Obtener el mayor valor.
3. Obtener el menor valor.
4. Salir
INTRODUCE OPCI´ON:
Solo se admiten, esos valores, cualquier otro valor va a hacer que se repita el men´u. El men´u
se va a estar mostrando hasta que se pulse 4, que mostrar´a en consola FIN DE PROGRAMA
y el programa termina.
– Usando la sentecia switch se recoger´a la opci´on mostrada, llamar´a al m´etodo correspondiente
de la clase anterior y se mostrar´a por consola el resultado.
 */
public class TestMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Los numeros deben de ser del 0 al 10");
        do {
            System.out.println("Introduce el primer numero");
            numero1 = scanner.nextInt();
        }while (numero1>10 || numero1<0);
        do {
            System.out.println("Introduce el segundo numero");
            numero2 = scanner.nextInt();
        }while (numero2>10 || numero2<0);
       int opcion;
       do {
           System.out.printf("1. Calcular el valor medio.%n2. Obtener el mayor valor.%n3. Obtener el menor valor.%n4. Salir%nINTRODUCE OPCIÒN:%n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("El valor medio de %d y %d es %.1f%n", numero1, numero2, Matematicas.devolverMedia(numero1,numero2));
                    break;
                case 2:
                    System.out.printf("El numero mayor de %d y %d es %d%n", numero1, numero2, Matematicas.mostrarNumeroMayor(numero1,numero2));
                    break;
                case 3:
                    System.out.printf("El numero menor de %d y %d es %d%n", numero1, numero2, Matematicas.mostrarNumeroMenor(numero1,numero2));
                    break;
            }
       }while (opcion!=4);

    }
}
