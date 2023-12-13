package Programacion.Ejercicio.Ejercicios.Tema1.examen1ACurso2018_19;
/*
1.Los tres lados a, b y c de un tri´angulo deben satisfacer la desigualdad triangular:
cada uno de los lados no puede ser m´as largo que la suma de los otros dos. Realiza una
clase denominada Triangulo que contenga los siguientes m´etodos:
    -Un m´etodo est´atico que recibe como par´ametros los tres lados del tri´angulo y nos
    diga si dicho tri´angulo es posible de acuerdo al principio de desigualdad triangular
    antes mencionado. Hay que hacer tres comprobaciones, una por cada lado.
    -Otro m´etodo est´atico, que dado los tres lados nos devuelva el per´ımetro de dicho
    tri´angulo.
    -Otro m´etodo, tambi´en est´atico, que nos diga si es un tri´angulo equilatero, esto
    ser´a cierto cuando los tres lados sean iguales.
    -Otro m´etodo que nos diga si es un tri´angulo rect´angulo. Un tri´angulo rect´angulo
    satisface el teorema de pit´agoras (a2 = b2 + c2). Para comprobar dicho teorema,
    previamente tienes que determinar cual es el lado mas grande comparando todos
    los lados y ese ser´a la posible hipotenusa (a en la f´ormula anterior).
    -Y por ´ultimo otro m´etodo est´atico que nos diga si es un tri´angulo is´osoceles, es
    decir que tiene dos lados iguales y otro desigual.
Realiza una clase TestTriangulo que lleve acabo las siguientes acciones:
    -Mediante la clase Scanner solicita los tres lados del tri´angulo. Dichos lados deben
    ser de tipo entero.
    -En el caso que se introduzca un lado con valor negativo o cero, el programa termi-
    nar´a con un mensaje diciendo que dicho lado no se puede admitir.
    -Se llamar´a al m´etodo de la clase Triangulo que ratifica la desigualdad triangular,
    de manera que si el tri´angulo no es posible indicar´a que dicho tri´angulo no es v´alido
    y terminar´a el programa.
    -En caso de que el tri´angulo es viable, el programa dir´a si es o no equilatero, si es o
    no rect´angulo y si es o no is´osceles.
    -Puedes probar los siguientes valores:
        - 1 5 9 No es posible el tri´angulo
        - -1 2 3 No es v´alido alg´un lado
        - 1 1 1 Tri´angulo equilatero, no rect´angulo y no is´osceles.
        - 3 4 5 Tri´angulo no equilatero, rect´angulo y no is´osceles.
        - 5 5 7 Tri´angulo no equilatero, no rect´angulo y s´ı is´osceles.
        - 6 7 8 Tri´angulo no equilatero, no rect´angulo y no is´osceles.
Realiza la documentaci´on de la clase Triangulo, incluyendo las etiquetas autor y versi´on.
Recuerda que no solo hay que documentar la cabecera de la clase, sino tambi´en todos
los m´etodos.
 */
import java.util.Scanner;
public class TestTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduce el valor de los lados del triangulo");
        int lado1 = scanner.nextInt();
        System.out.printf("Faltan 2 lados mas");
        int lado2 = scanner.nextInt();
        System.out.printf("Uno más");
        int lado3 = scanner.nextInt();
        if (lado1 < 1)
            System.out.println("No es valido un lado");
        if (lado2 < 1)
            System.out.println("No es valido un lado");
        if (lado3 < 1)
            System.out.println("No es valido un lado");
        if (Triangulo.desigualdadTriangular(lado1, lado2, lado3) == true){
            System.out.println("Es posible este triangulo");
            System.out.printf("El perimetro de su triangulo es %d%n", Triangulo.perimetroTriangulo(lado1,lado2,lado3));
            /* manera juan luis prototipo
            if (Triangulo.decirEquilatero(lado1,lado2,lado3) == true)
                System.out.printf("%d, %d, %d Triangulo equilatero, no isosceles y no rectangulo%n",lado1, lado2, lado3);
            else
                System.out.printf("");
             */
            switch (Triangulo.mostrarTipoTriangulo(lado1,lado2,lado3)){
                case 1:
                    System.out.printf("%d, %d, %d Triangulo equilatero, no isosceles y no rectangulo%n",lado1, lado2, lado3);
                    break;
                case 2:
                    System.out.printf("%d, %d, %d Triangulo no equilatero, isosceles y no rectangulo%n",lado1, lado2, lado3);
                    break;
                case 3:
                    System.out.printf("%d, %d, %d Triangulo no equilatero, no isosceles y rectangulo%n",lado1, lado2, lado3);
                    break;
                default:
                    System.out.printf("%d, %d, %d Triangulo no equilatero, no isosceles y no rectangulo%n",lado1, lado2, lado3);
                    break;
            }
        }
        else
            System.out.println("No es posible el triangulo");
    }
}
