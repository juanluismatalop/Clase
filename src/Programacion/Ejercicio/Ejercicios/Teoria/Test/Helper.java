package Programacion.Ejercicio.Ejercicios.Teoria.Test;

public class Helper {
    public static double calcularValorMedio(int valor1, int valor2){

        return (valor1+valor2)/ 2.0;
    }
    public static float calcularRaizCuadrada (int valor){
        return (float) Math.sqrt(valor);
    }
    public static int[] devolver2cuadrados(int valor1, int valor2){
        int[] cuadrados = new int[2];
        cuadrados[0] = valor1 * valor1;
        cuadrados[1] = valor2 * valor2;
        return cuadrados;
    }
    public static int devolverMayor(int valor1, int valor2){
        return Math.max(valor1, valor2);
    }
    public static int devolverMenor(int valor1, int valor2){
        return Math.min(valor1, valor2);
    }
    public static boolean esPrimo(int valor){
        if (valor == 0)
            return false;
        for(int i = 2; i < valor;i++){
            if(valor % i == 0)
                return false;
        }
        return true;
    }
    public static boolean esDivisible1entre2 (int valor1, int valor2) {
        if (valor1 % valor2 == 0)
            return true;
        return false;
    }
}
