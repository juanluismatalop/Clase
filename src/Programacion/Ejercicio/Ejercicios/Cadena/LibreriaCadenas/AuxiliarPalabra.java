package Programacion.Ejercicio.Ejercicios.Cadena.LibreriaCadenas;

/**
 * CLase para crear una libreria con distintos metodos sobre cadenas
 * @author julu
 * @version 1.0.0
 */
public class AuxiliarPalabra {
    /**
     * Metodo que devuelve el numero de letras que tienen una palabra
     * ejemplo 4
     * @param cadena a analizar
     * @return numero de letras
     */
    public static int obtenerNumeroDLetras(String cadena) {
        if(cadena == null)
            return -1;

        return cadena.length();
    }

    /**
     * Metodo que te dice que si la palabra empieza por vocal o no
     * ejemplo amigo true
     * @param cadena a analizar
     * @return si empieza por vocal
     */
    public static Boolean empiezaVocal(String cadena){
        if (cadena == null)
            return null;
        return cadena.toLowerCase().startsWith("a")||
                cadena.toLowerCase().startsWith("e")||
                cadena.toLowerCase().startsWith("i")||
                cadena.toLowerCase().startsWith("o")||
                cadena.toLowerCase().startsWith("u")||
                cadena.toLowerCase().startsWith("á")||
                cadena.toLowerCase().startsWith("é")||
                cadena.toLowerCase().startsWith("í")||
                cadena.toLowerCase().startsWith("ó")||
                cadena.toLowerCase().startsWith("ú");
    }

    /**
     * Metodo que te dice que si la palabra empieza por vocal o no
     * ejemplo amigo true
     * @param cadena a analizar
     * @return si acaba por vocal
     */
    public static  Boolean acabaVocal(String cadena){
        if (cadena == null)
            return null;
        return cadena.toLowerCase().endsWith("a")||
                cadena.toLowerCase().endsWith("e")||
                cadena.toLowerCase().endsWith("i")||
                cadena.toLowerCase().endsWith("o")||
                cadena.toLowerCase().endsWith("u")||
                cadena.toLowerCase().endsWith("á")||
                cadena.toLowerCase().endsWith("é")||
                cadena.toLowerCase().endsWith("í")||
                cadena.toLowerCase().endsWith("ó")||
                cadena.toLowerCase().endsWith("ú");
    }

    /**
     * Metodo que cuenta el numero de vocales
     * ejemplo juan 2
     * @param cadena a analizar
     * @return el numero de vocales
     */
    public static int contarVocales(String cadena){

        return 0;
    }

    /**
     * Metodo que si la cadena contienen o no un caracter
     * null si la cadena es null
     * ejemplo horrar y h devuelve true, horrar y z false
     * @param cadena a analizar
     * @return si contiene o no la letra
     */
    public static boolean contieneLetra(String cadena){

        return false;
    }

    /**
     * Metodo que nos indica si la cadena es un palindromo o no
     * ejemplo ojo ojo true, perro orrep false
     * @param cadena a analizar
     * @return si es o no un palindromo
     */
    public static Boolean esUnPalimodro(String cadena){
        if (cadena == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        builder.reverse();
        return cadena.equals(builder.toString());
    }

    /**
     * Metodo que nos dice si una palabra es o no igual a la otra
     * ejemplo  si no false, si si true
     * @param cadena1 a analizar
     * @param cadeana2 a analizar
     * @return si es o no iguales las dos cadenas
     */
    public static Boolean sonPalabrasIguales(String cadena1, String cadeana2){
        if (cadena1 == null || cadeana2 == null){
            return null;
        }

        return null;
    }
}

