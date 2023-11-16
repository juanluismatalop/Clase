package Examenes23_24.Trimestre1;
/*Enunciado
2. Usando Geany crea un programa denominado Triangulo2.java que es una versi´on del anterior, en este
programa vamos a usar la clase Scanner para solicitar los valores de los ´angulos 1 y 2, en vez de que el
programa los obtenga de forma aleatoria. Y todas las variables a utilizar son de tipo float.
El uso del Scanner se basa en:
    • Importar el Scanner con la sentencia:
    import java.util.Scanner;
    • Generar la referencia del Scanner:
    Scanner sc = new Scanner(System.in);
    • Leer los datos de los ´angulos que para valores float ser´ıa:
    sc.nextFloat()
    • El programa solicita el ´angulo 1 y posteriormente el a´ngulo 2
    • Si la suma de ambos es superior a o igual a 180, se deben volver a solicitar los datos, hasta que se
    pueda formar un tri´angulo.
    • En el caso de que todo sea correcto, el programa continuar´a y calcular´a el tercer ´angulo y mostraremos
    los tres ´angulos por pantalla, usando dos decimales:
    ´Angulo 1: 100,90, ´angulo 2: 68,11 y ´angulo 3: 10.99
    • Usamos un printf para este menester.
    • El programa debe ser ejecutable
 */
/*
 * Nombre y apellidos : Juan Luis Mata López
 * Nombre del programa : Triangulo2.java
 * Version : 1.0
 * Fecha : 16/11/23
 */
import java.util.Scanner;
public class Triangulo2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float angulo1;
        float angulo2;
        do{
            //pide el angulo1
            System.out.printf("Introduce el valor del angulo 1%n");
            angulo1 = scanner.nextFloat();
            //pide el angulo2
            System.out.printf("Introduce el valor del angulo 2%n");
            angulo2 = scanner.nextFloat();
        }while((angulo1+angulo2) >= 180.00f);
        scanner.close();
        float angulo3 = 180f-(angulo1 + angulo2);
        //mostrar el valor de los angulos de los triangulos
        System.out.printf("angulo1: %.2f: angulo2: %.2f y angulo3: %.2f", angulo1, angulo2, angulo3);
    }
}