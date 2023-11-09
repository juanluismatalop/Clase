package Teoria.POO.Cilindros;
public class TestCilindro {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        cilindro.setRadio(3);
        cilindro.setAltura(20);
        System.out.printf(cilindro.toString());
    }
}
