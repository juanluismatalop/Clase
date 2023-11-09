package Ejercicios.POO.Cilindros;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro() {
        this.radio = radio;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double CalcularAreaDeLaCircunferencia(){
        double areaCircunferencia;
        return areaCircunferencia = 3.1415 * (radio*radio);
    }

    public double CalcularAreaRectangulo(){
        double areaRectangulo;
        return areaRectangulo = altura * (2*radio*3.1415);
    }

    public double CalcularSuperficie(){
        return 2*CalcularAreaDeLaCircunferencia()*CalcularAreaRectangulo();
    }

    public double CalcularVolumenCilindro(){
        double volumen;
        return volumen = 3.1415 * (radio*radio)*altura;
    }

    @Override
    public String toString() {
        return String.format("Los datos de el cilindro de radio %.2f y una altura de %.2f tiene%nVolumen = %.2f%nSuperficie = %.2f%n", getRadio(), getAltura(), CalcularVolumenCilindro(), CalcularSuperficie());
    }
}
