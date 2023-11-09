package Teoria.POO.Rectangulo;

public class Test {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo1.getAltura());
        System.out.println(rectangulo1.getAncho());
        rectangulo1.setAltura(5);
        System.out.println(rectangulo1.getAltura());

        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setAltura(11);
        rectangulo2.setAncho(6);
        System.out.printf("Rectangulo de %d de ancho y %d de alto%n Area = %d%n Perimetro = %d%n Diagonal = %.2f%n",rectangulo2.getAncho(), rectangulo2.getAltura(), rectangulo2.AreaRectangulo(), rectangulo2.PerimetroRectangulo(), rectangulo2.DiagonalRectangulo());
    }
}
