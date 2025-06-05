package org.example.Exercicios.ExercicioDois;

public class Coordenada {
    private double x, y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getCoordenada() {
        return new double[]{this.x, this.y};
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.x;
    }


    public void setCoordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
}
