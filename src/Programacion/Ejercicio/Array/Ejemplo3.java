package Programacion.Ejercicio.Array;

import java.util.Arrays;

public class Ejemplo3 {
    private int[] enteros;

    public Ejemplo3(int[] enteros) {
        this.enteros = enteros;
    }

    public int[] getEnteros() {
        return enteros;
    }

    public void setEnteros(int[] enteros) {
        this.enteros = enteros;
    }

    @Override
    public String toString() {
        return Arrays.toString(enteros);
    }

    public int obtenerMayorV1(){
        int numeroMasGrande = Integer.MIN_VALUE;
        for( int entero : enteros){
            if(entero > numeroMasGrande)
                numeroMasGrande = entero;
        }
        return numeroMasGrande;
    }
}
