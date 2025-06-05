package org.example.Exercicios.ExercicioDois;

import java.util.ArrayList;
import java.util.List;

public abstract class Forma {
    private String corDeLinha;
    private String corDePreenchimento;
    private List<Coordenada> coordenadas = new ArrayList<>();

    public Forma(String corDeLinha, String corDePreenchimento) {
        this.corDeLinha = corDeLinha;
        this.corDePreenchimento = corDePreenchimento;
    }

    public String desenhar(){
        return "Linha: cor de linha = " + getCorDeLinha() + ", cor de preenchimento = " + getCorDePreenchimento() + ", Área: " + calcularArea();
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getCorDeLinha() {
        return corDeLinha;
    }

    public void setCorDeLinha(String corDeLinha) {
        this.corDeLinha = corDeLinha;
    }

    public String getCorDePreenchimento() {
        return corDePreenchimento;
    }

    public void setCorDePreenchimento(String corDePreenchimento) {
        this.corDePreenchimento = corDePreenchimento;
    }

    public List<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }

}
