package Programacion.Ejercicio.Ejercicios.POO.EcuacionSegundoGrado;

public class EcuacionSegundoGrado {
    private int a;
    private int b;
    private int c;

    public EcuacionSegundoGrado() {
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
    public double CalcularX1(){
        double x1;
        return x1 = -b + Math.sqrt((b*b)-4*a*c)/2*a;
    }
    public double CalcularX2(){
        double x2;
        return x2 = -b + Math.sqrt((b*b)-4*a*c)/2*a;
    }

    @Override
    public String toString() {
        return String.format("La ecuacion de variable %d , %d y %d nos dara las soluciones X1 %.2f y X2 %.2f",getA(),getB(),getC(),CalcularX1(),CalcularX2());
    }
}
