package Programacion.Ejercicio.Ejercicios.Tema1.Examen1;

import java.util.Scanner;

public class Examen1 {
    public static void main(String[] args) {
        /*
        1. Realiza un peque˜no programa, usando Geany o Notepad++, denominado Basico.java que cumpla los
            siguientes requisitos:
            • Imprima ”Hola” y tu nombre en l´ıneas separadas, las dobles comillas incluidas. Usa solo un
              System.out.println() para este menester. Ejemplo de salida
            "Hola"
            Francisco García
            • Imprima en una lınea independiente El resultado de sumar 20 + 5 es y seguidamente el valor de la
            operación sin usar ninguna variable (no vale poner 25, sino realizar la operacion aritmetica). Usa
            un System.out.printf() ´unicamente. La salida serıa:
            El resultado de sumar 20 + 5 es 25
            • Usando un unico System.out.println() muestre en una lınea independiente tu primer apellido, usando
            solamente caracteres. Ejemplo para Manuel concatenar´ıamos M, a, n, u, e, l. Debe mostrar tu
            nombre. En esta caso la salida ser´ıa
            Manuel
            • Usando un solo System.out.printf(), muestra en una l´ınea independiente la siguiente cadena: La
            divisi´on de 7 entre 3 vale y seguidamente el resultado con tres decimales y sin usar variable alguna.
            En este caso debe mostrar:
            La divisi´on de 7 entre 3 vale 2.333
            • Usando un comentario de bloque indica el nombre del programa, tu nombre, tus apellidos y la
            fecha, cada uno de estos item en una l´ınea separado.
            • Usando un comentario de l´ınea, encima de cada sentencia de System.out.print... indica la salida
            que se va a mostrar en consola.
     */
        //"Hola"
        //Juan Luis Mata López
        System.out.println("\"Hola\"\nJuan Luis Mata López");
        System.out.println(" ");
        //El resultado de sumar 20 + 5 es 25
        System.out.printf("El resultado de sumar %d + %d es %d%n", 20, 5, 20+5);
        System.out.println(" ");
        //Mata
        System.out.println("M"+"a"+"t"+"a");
        System.out.println(" ");
        //La division de 7 entre 3 es de 7.333
        System.out.printf("La division de %d entre %d es %.3f%n", 7, 3, (7.0/3.0));
        /*
        examen1.java
        Juan Luis
        Mata López
        14/11/2023
         */
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        /*
        2. Crea un programa denominado Tipos.java que realice lo siguiente:
        • Calcule la energ´ıa potencial de un cuerpo, para esto necesitamos saber la masa y la altura de dicho
        cuerpo, el c´alculo se realiza multiplicando la masa por la altura y la aceleraci´on de la gravedad,
        para el desarrollo del programa ten en cuenta lo siguiente:
        – Declara la aceleraci´on de la gravedad como una constante con un valor de 9.8
        – Solicite mediante un objeto Scanner el valor de la altura como un valor float.
        – Solicite a igual que antes el valor de la masa, tambien como tipo float.
        – Declara una variable float para la energ´ıa potencial que recoja el c´alculo mediante la f´ormula:
        Ep = masa ∗ altura ∗ gravedad (1)
        – Muestra por consola el resultado, usando un printf y los valores con un ´unico decimal. Ejemplo:
        La energ´ıa potencial de un cuerpo de 10.1 Kg de masa que se encuentra a la
        altura de 2.6 m vale 257.3
        • Calcule la hipotenusa de un tri´angulo rect´angulo, se calcula como la ra´ız cuadrada de la suma de
        los cuadrados de los catetos:
        Para esto realiza lo siguiente:
        – Solicita mediante Scanner una variable entera que ser´a cateto1
        – Solicita mediante Scanner una variable entera que ser´a cateto2
        – Crea una variable entera que ser´a la hipotenusa, usa Math.sqrt() para calcular la ra´ız cuadrada,
        como est´a funci´on devuelve un double, emplea un casting para la conversi´on a un valor entero.
        – Usando un printf muestra el resultado como:
        La hipotenusa de un tri´angulo rect´angulo de catetos 5 y 7 vale 8
         */
        double masa = 10.1;
        double altura = 2.6;
        final double G = 9.8;
        double energiaPotencial = masa * altura * G;
        System.out.printf("\"En double \"%nLa energía pontencial de un cuerpo de %.1f kg de masa que se encuentra a la altura de %.1f m vale %.1f%n", masa, altura, energiaPotencial);
        float masaF = 10.1f;
        float alturaF = 2.6f;
        final float GF = 9.8f;
        float energiaPotencialF = (float) masaF * alturaF * GF;
        System.out.printf("\"En float \"%nLa energía pontencial de un cuerpo de %.1f kg de masa que se encuentra a la altura de %.1f m vale %.1f%n", masaF, alturaF, energiaPotencialF);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el 1º cateto:");
        int cateto1 = scanner.nextInt();
        System.out.println("Introduzca el 2º cateto:");
        int cateto2 = scanner.nextInt();
        int hipotenusa =(int) Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
        System.out.printf("La hipotenusa de un tríangulo rectángulo de catetos %d y %d vale %d%n",cateto1, cateto2, hipotenusa);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


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
    }
}
