package Programacion.Ejercicio.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ejemplo2 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> enteros = crearListaTamanno(20);
        System.out.println("===LISTA ORIGINAL===");
        System.out.println(enteros);
        System.out.println("\n\n");
        System.out.println("===LISTA DE PARES===");
        System.out.println(obtenerPares(enteros));
        System.out.println("\n\n");
        System.out.println("===ELIMINANDO EL 3===");
        eliminarNumero(enteros, 3);
        System.out.println(enteros);
        System.out.println("\n\n");
        System.out.println("===AÑADIR EL 100===");
        añadir100(enteros, 100);
        System.out.println(enteros);
        System.out.println("\n\n");
        System.out.println("===AÑADIR EN POSICION DE LA LISTA===");
        cambiarEnPosicion(enteros, 56, 7);
        System.out.println(enteros);
    }

    private static List<Integer> crearListaTamanno(int tamanno) {
        List<Integer> listaPares = new ArrayList<>();
        for (int i = 0; i < tamanno; i++){
            listaPares.add(random.nextInt(15));
        }
        return listaPares;
    }

    //Un metodo pasamos una coleccion y que nos devuelva
    // otra coleccion con solo los valores pares.
    private static List<Integer> obtenerPares(List<Integer> enteros){
        List<Integer> listaPares = new ArrayList<>();

        for (Integer entero : enteros){
            if(entero % 2 == 0){
                listaPares.add(entero);
            }
        }
        return listaPares;
    }
    //metodo que se le pasa una coleccion de enteros y un entero
    //y añade este entero a la colección
    private static void eliminarNumero(List<Integer> enteros, Integer numero){
        enteros.remove(numero);
    }
    //método que se le pasa una colección de enteros y un entero
    //y añade este entero a la colección
    private static void añadir100 (List<Integer> enteros, int numero){
        enteros.add(numero);
    }
    //método que se le pasa una colección de enteros, un entero,
    //un índice y añade el entero a esa posición índice
    private static void cambiarEnPosicion(List<Integer> enteros, int numero, int posicion){
        if (posicion > enteros.size() -1){
            return;
        }
        enteros.add(posicion, numero);
    }
}
