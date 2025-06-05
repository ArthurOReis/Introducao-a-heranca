package org.example.Exercicios.ExercicioDois;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String corDeLinha, String corDePreenchimento, double largura, double altura) {
        super(corDeLinha, corDePreenchimento);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
