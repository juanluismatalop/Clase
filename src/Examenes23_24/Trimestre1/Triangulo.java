package Examenes23_24.Trimestre1;
/* Enunciado
1. Realiza un peque˜no programa, usando Geany denominado Tri´angulo1.java que cumpla los siguientes
requisitos:
    • Debemos tener en cuenta que la suma de los tres ´angulos que forman un tri´angulo son siempre 180
    grados
    • Usando la generaci´on de n´umeros enteros aleatorios siguiente (que produce n´umeros comprendidos
    entre 1 y 180) genera dos variables de tipo entera denominadas angulo1 y angulo2, que corresponde
    a dos posibles ´angulos de un tri´angulo:
    new java.util.Random().nextInt(180) + 1
    • Calcula el ´angulo restante y almac´enalo en una variable suponiendo su tipo y ll´amala angulo3.
    • Puede ocurrir que la suma de los ´angulos 1 y ´angulos 2 (obtenidos aleatoriamente) superen o igualen
    los 180 grados, por lo tanto no se puede formar un tri´angulo, en ese caso mostraremos en consola
    un mensaje indicando esta situaci´on, que puede ser en el caso que hayamos obtenido aleatoriamente
    los valores 95 y 85:
    Con los ´angulos 95 y 85 no se puede formar un tr´ıangulo
    • En caso contrario mostramos el mensaje con el valor de los tres ´angulos, los dos obtenidos aleato-
    riamente y el calculado por el programa, ejemplo de salida:
    Angulo 1: 100, ´angulo 2: 70 y ´angulo 3: 10
    • En el caso anterior los valores 100 y 70 son obtenidos aleatoriamente y el valor de 10 es calculado
    por el programa.
    • Usa un printf para formatear la salida.
    • El programa debe ser ejecutable
 */
/*
 * Nombre y apellidos : Juan Luis Mata López
 * Nombre del programa : Triangulo.java
 * Version : 1.0
 * Fecha : 16/11/23
 */
public class Triangulo {

    public static void main (String[] args) {
        int angulo1 = new java.util.Random().nextInt(180) + 1;
        int angulo2 = new java.util.Random().nextInt(180) + 1;
        if((angulo1 + angulo2) >= 180){
            //Mostrara que no es posible hacer un triangulo debido a que dos angulos ya superan los 180º
            System.out.printf("Con angulo de %d y %d no se puede formar un triangulo", angulo1, angulo2);
        }else{
            int angulo3 = 180 - (angulo1 + angulo2);
            //Mostrara que es posible realizar el triangulo y te mostrara sus angulos
            System.out.printf("angulo 1: %d, angulo 2: %d y angulo 3: 10%n", angulo1, angulo2, angulo3);
        }

    }
}
