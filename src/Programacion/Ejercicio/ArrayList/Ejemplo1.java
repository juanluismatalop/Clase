package Programacion.Ejercicio.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<String> listaCiudades = new ArrayList<>();
        listaCiudades.add("Madrid");
        listaCiudades.add("Paris");
        listaCiudades.add("Moscu");
        listaCiudades.add("Bruselas");
        listaCiudades.add("Kiev");
        System.out.println(listaCiudades);
        System.out.println("===MOSTRAR CIUDADES MAYUSCULAS===");
        for (String ciudad : listaCiudades){
            //System.out.println(ciudad.toUpperCase());
            System.out.printf("%-10S", ciudad);
        }
        System.out.println("\n\n===MOSTRAR CIUDADES Y POSICIONES===");
        for (int i = 0; i < listaCiudades.size(); i++){
            System.out.printf("%d: %s%n", i + 1, listaCiudades.get(i));
        }
    }
}
