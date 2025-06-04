package org.example.Exercicios.ExercicioUm;

public class Jogador {
    private String nome;
    private int vida;
    private int ataque;
    private int velocidade;

    public Jogador(String nome, int vida, int ataque, int velocidade){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
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

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
