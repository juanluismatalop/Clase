package Examenes23_24.Trimestre1;
/*Enunciado
3. Usando Geany crea una clase llamada Numeros.java teniendo en cuenta lo siguiente:
    • Crearemos los siguientes m´etodos est´aticos:
    1. Un m´etodo llamado devolverMedia que recibe tres n´umeros enteros y devuelve el valor medio
    como float
    2. Un m´etodo llamado devolverMayorValor que recibe tres n´umeros enteros y devuelve el valor
    mas grande de los dos.
    3. Un m´etodo llamado devolverMenorValor que recibe tres n´umeros enteros y devuelve el valor
    m´as peque˜no de los dos.
    • Los n´umeros enteros se pueden generar de forma aleatoria (puedes usar el ejemplo de la pregunta
    1) o utilizar un Scanner como en la cuesti´on 2.
    • Posteriormente se despliegar´a un men´u con las siguientes opciones:
        1. Calcular el valor medio.
        2. Obtener el mayor valor.
        3. Obtener el menor valor.
        4. Salir
        INTRODUCE OPCI´ON:
Solo se admiten, esos valores, cualquier otro valor va a hacer que se repita el men´u. El men´u se
va a estar mostrando hasta que se pulse 4, que mostrar´a en consola FIN DE PROGRAMA y el
programa termina.
    • Usando la sentecia switch se recoger´a la opci´on mostrada, llamar´a al m´etodo correspondiente de la
    clase anterior y se mostrar´a por consola el resultado. Ejemplo con los valores 1, 3 y 5:
        (Pulsando 1) Valor medio: 4.50
        (Pulsando 2) Mayor valor: 5
        (Pulsando 3) Menor valor: 1
        (Pulsando 4) FIN DE PROGRAMA (y finaliza el programa)
    • Crea un comentario de bloque al inicio de la clase que explique que es lo que hace el programa.
    • Crea un comentario de l´ınea encima de cada m´etodo que explique que es lo que hace. Si te hace
    falta m´as de una l´ınea, usa por cada una de ellas un comentario de linea, nunca un comentario de
    bloque.
    • El programa es ejecutable.
 */
/*
 * Nombre y apellidos : Juan Luis Mata López
 * Nombre del programa : Numeros.java
 * Version : 1.0
 * Fecha : 16/11/23
 * Este programa realizara calculos llamando a metodos estaticos como calcular valor medio
 * obtener el mayor o menor valor o salir de el programa
 */
import java.util.Scanner;
public class Numeros {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //te pide el 1º numero
        System.out.printf("Introduce el 1º valor:%n");
        int numero1 = scanner.nextInt();
        //te pide el 2º numero
        System.out.printf("Introduce el 2º valor:%n");
        int numero2 = scanner.nextInt();
        //te pide el 3º numero
        System.out.printf("Introduce el 3º valor:%n");
        int numero3 = scanner.nextInt();
        int menu;
        do{
            //muestra el menu
            System.out.printf("1. Calcular el valor medio%n2. Obtener el mayor valor%n3. Obtener el menor valor%n4. Salir%nINTRODUCE LA OPCIÓN%n");
            menu = scanner.nextInt();
            switch(menu){
                //muestra la media de los 3 numeros
                case 1 -> System.out.printf("Valor medio: %.2f%n", calcularValorMedio(numero1, numero2, numero3));
                //muestra el mayor valor de los 3 numeros
                case 2 -> System.out.printf("Mayor valor: %d%n", mostrarNumeroMayor(numero1, numero2, numero3));
                //muestra el menor valor de los 3 numeros
                case 3 -> System.out.printf("Menor valor: %d%n", mostrarNumeroMenor(numero1, numero2, numero3));
                //sale del programa
                case 4 -> System.out.printf("Adios%n");
            }
        }while(menu != 4);
    }
    //El metodo realiza la media de los 3 numeros.
    public static double calcularValorMedio(int numero1, int numero2, int numero3){
        double valorMedio;
        return valorMedio = (numero1+numero2+numero3)/3;
    }
    //El metodo muestra el numero mayor
    public static int mostrarNumeroMayor(int numero1, int numero2, int numero3){
        int mayor = numero1;
        if(mayor< numero2)
            mayor = numero2;
        if(mayor<numero3)
            mayor = numero3;
        int numeroMayor;
        return numeroMayor = mayor;
    }
    //El metodo muestra el numero menor
    public static int mostrarNumeroMenor(int numero1, int numero2, int numero3){
        int menor = numero1;
        if(menor> numero2)
            menor = numero2;
        if(menor>numero3)
            menor = numero3;
        int numeroMenor;
        return numeroMenor = menor;
    }
}