package Teoria.POO.Rectangulo;

public class Test {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo1.getAltura());
        System.out.println(rectangulo1.getAncho());
        rectangulo1.setAltura(5);
        System.out.println(rectangulo1.getAltura());

    }
}
