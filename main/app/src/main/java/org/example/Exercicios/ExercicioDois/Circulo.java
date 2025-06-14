package org.example.Exercicios.ExercicioDois;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String corDeLinha, String corDePreenchimento, double raio){
        super(corDeLinha, corDePreenchimento);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
