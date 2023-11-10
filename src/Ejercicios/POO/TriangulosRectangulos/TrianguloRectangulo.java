package Ejercicios.POO.TriangulosRectangulos;

public class TrianguloRectangulo {
    private int cateto1;
    private int cateto2;

    public TrianguloRectangulo() {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public int getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }
    public double CalcularHipotenusa(){
        double hipotenusa;
        return hipotenusa = Math.hypot(cateto1, cateto2);
    }
    public double CalcularAreaTriangulo(){
        double area;
        return area = (cateto1*cateto2)/2;
    }

    @Override
    public String toString() {
        return String.format("El triangulo de catetos %d y %d tiene una hipotenusa de %.2f y un area de %.2f%n", getCateto1(), getCateto2(), CalcularHipotenusa(), CalcularAreaTriangulo());
    }
}
