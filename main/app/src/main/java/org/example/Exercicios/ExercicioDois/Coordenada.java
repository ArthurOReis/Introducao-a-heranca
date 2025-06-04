package org.example.Exercicios.ExercicioDois;

public class Coordenada {
    private double x, y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getCoordenada() {
        return new double[]{x, y};
    }

    public void setCoordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
}
