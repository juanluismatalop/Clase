package Ejercicios.POO.TriangulosRectangulos;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        trianguloRectangulo.setCateto1(3);
        trianguloRectangulo.setCateto2(5);
        System.out.printf(trianguloRectangulo.toString());

    }
}
