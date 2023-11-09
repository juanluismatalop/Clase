package Teoria.POO.Circulo;

public class TestCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaido(5);
        System.out.printf("El circulo de radio %d%n Tiene %.2f m² de area%n Tiene %.2f m de perimetro", circulo.getRaido(), circulo.CalcularArea(), circulo.CalcularPerimetro());
    }
}
