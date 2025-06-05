package org.example.Exercicios.ExercicioDois;

public class Linha extends Forma {

    public Linha(String corDeLinha, String corDePreenchimento) {
        super(corDeLinha, corDePreenchimento);
    }

    @Override
    public double calcularArea() {
        return 0; // Linha não tem área
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

}