package Teoria.POO.Rectangulo;

public class Rectangulo {
    //metodo de calculo de area
    //metodo de calculo de perimetro
    //metodo de calculo de la daigonal
    private int altura;
    private int ancho;

    public int getAltura() {
        return altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int AreaRectangulo(){
        int area;
        return area = getAltura()*getAncho();
    }
    public int PerimetroRectangulo(){
        int perimetro;
        return perimetro = 2*getAncho() + 2*getAltura();
    }
    public double DiagonalRectangulo(){
        double diagonal;
        return diagonal = Math.sqrt(getAltura()*getAltura()+getAncho()*getAncho());
    }

}
