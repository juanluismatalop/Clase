package Programacion.Ejercicio.Array;

public class Ejemplo2 {
    public static void main(String[] args) {
        //en una linea quiera un array de char
        char[] array = {'a', 'b', 'c', 'd'};
        char[] arrayInversa = invertirArrayChar(array);
    }
    //un metodo que se le pasa un array de char
    //devuelve un array con los elemento en orden contrario
    //es decir el elemento 0 seria el ultimo elemento
    // el ultimo seria el primero, los medios se intercambian
    public static char[] invertirArrayChar (char[] array){
        //codigo
        char[] arrayInversa = new char[array.length];
        for(int i = 0; i < array.length; i++){
            arrayInversa[i] = array[i];
        }
        return arrayInversa;
    }

}
