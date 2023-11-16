package Ejercicios.POO.EcuacionesSegundoGrado;

public class EcuacionesSegundoGrado {
    private int a;
    private int b;
    private int c;

    public EcuacionesSegundoGrado() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public static double x1 (int a, int b, int c){
        double x1;
        return x1 = (-b + Math.sqrt(b*b -4*a*c))/2*a;
    }
    public static double x2 (int a, int b, int c){
        double x2;
        return x2 = (-b + Math.sqrt(b*b -4*a*c))/2*a;
    }

    @Override
    public String toString() {
        return String.format("La ecuacion de segundo grado de %dx² %dx y %d da los resultados:%n%.2f%n%.2f", a, b, c, x1(a,b,c), x2(a, b, c));
    }
}
