package ExamenesAnteriores.Tema1.examen1ACurso2018_19;
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
public class Triangulo {
    /* manera de juan luis
    public static boolean desigualdadTriangular(int lado1, int lado2, int lado3){
        boolean esPosible;
        boolean finalPosible;
        if (lado1+lado2 > lado3){
            if (lado2+lado3>lado1){
                if (lado3+lado1>lado2){
                    return esPosible = true;
                }else esPosible = false;
            }else
                return esPosible = false;
        }else
            return  esPosible = false;
        return finalPosible = esPosible;
    }*/
    //manera de manolo(profe)
    public static boolean desigualdadTriangular(int lado1, int lado2, int lado3){
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado3 + lado2 > lado1);
    }
    public  static int perimetroTriangulo(int lado1, int lado2, int lado3){
        int perimetro;
        return perimetro = lado1+lado2+lado3;
    }
   /* manera juan luis
    public static boolean decirEquilatero(int lado1, int lado2, int lado3){

        boolean esEquilatero;
        boolean esValido;
        if(lado1==lado2)
            if (lado1==lado3)
                esValido = true;
            else
                esValido = false;
        else
            esValido = false;
        return esEquilatero = esValido;
    }
    public static boolean decirRectangulo(int lado1, int lado2, int lado3){
        boolean esRectangulo;
        boolean esValido;
            if()
            esValido = true;
        else
            esValido = false;
        return esRectangulo == esValido;
    }*/
    //manera manolo(profe)
    public static int mostrarTipoTriangulo(int lado1, int lado2, int lado3){
        int numero;
        if (lado1 == lado2 && lado2 == lado3){
            numero = 1;
        } else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado3)){
            numero = 2;
        }else
            numero = 3;
        int tipo;
        return tipo = numero;
    }
}
