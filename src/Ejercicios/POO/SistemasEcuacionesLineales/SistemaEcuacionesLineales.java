package Ejercicios.POO.SistemasEcuacionesLineales;

public record SistemaEcuacionesLineales(int a, int b, int c, int d, int e, int f) {
    public boolean VerSiTienenSolucion(){
        return a * d - b * c != 0;
    }
    public double CalcularX(){
        return (e*d-b*f) / (a*d-b*c);
    }
    public double CalcularY(){
        return (a*f-e*c)/(a*d-b*c);
    }

}
