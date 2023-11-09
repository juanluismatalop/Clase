package Teoria.POO.Circulo;

public class Circulo {
    int raido;

    public int getRaido() {
        return raido;
    }

    public void setRaido(int raido) {
        this.raido = raido;
    }
    public double CalcularArea(){
        double area;
        return area = 3.1415*getRaido()*getRaido() ;
    }
    public double CalcularPerimetro(){
        double perimetro;
        return perimetro = 2*3.1415*getRaido();
    }
}
