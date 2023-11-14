package ExamenesAnteriores.Tema1.Examen1;
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
public class Matematicas {
    public static double devolverMedia(int numero1, int numero2){
        double valorMedio;
        return valorMedio = (numero1 + numero2)/2;
    }
    public static int mostrarNumeroMayor(int numero1, int numero2){
        int mayorValor;
        int mas = numero1;
        if(numero2>mas)
            mas=numero2;
        else
            mas=numero1;
        return mayorValor = mas;
    }
    public static int mostrarNumeroMenor(int numero1, int numero2){
        int menorValor;
        int menos = numero1;
        if(numero2<menos)
            menos=numero2;
        else
            menos=numero1;
        return menorValor = menos;
    }
}
