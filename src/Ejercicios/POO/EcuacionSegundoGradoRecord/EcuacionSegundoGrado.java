package Ejercicios.POO.EcuacionSegundoGradoRecord;

public record EcuacionSegundoGrado(int a, int b, int c) {
    public boolean EsResoluble(){
        return b * b - 4 * a * c >= 0;
    }
    public double calcularX1(){
        return -b + Math.sqrt(b * b - 4 * a * c)/(2*a);
    }
    public double calcularX2(){
        return -b - Math.sqrt(b * b - 4 * a * c)/(2*a);
    }
}
