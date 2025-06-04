package org.example.Exercicios.ExercicioUm;

public class Jogador {
    private String nome;
    private int vida;
    private int ataque;
    private double velocidade;

    public Jogador(String nome, int vida, int ataque, double velocidade){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(){
        return "O " + this.nome + " moveu na velocidade " + this.velocidade;
    }
    
    public String atacar(){
        return "O " + this.nome + " atacou com força " + this.ataque;
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
