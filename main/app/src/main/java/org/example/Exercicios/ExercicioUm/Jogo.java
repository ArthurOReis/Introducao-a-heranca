package org.example.Exercicios.ExercicioUm;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public static void main(String[] args) {
        
        List<Jogador> listaJogadores = new ArrayList<>();
        System.out.println("***  Java of Empires ***");

        System.out.println("Criando Aldeão, Arqueiro e Cavaleiro: ");
        
        Aldeao aldeao1 = new Aldeao();
        listaJogadores.add(aldeao1);
        System.out.println("Aldeão 1 criado");

        Arqueiro arqueiro1 = new Arqueiro();
        listaJogadores.add(arqueiro1);
        System.out.println("Arqueiro 1 criado");

        Cavaleiro cavaleiro1 = new Cavaleiro();
        System.out.println("Cavaleiro 1 criado");
        listaJogadores.add(cavaleiro1);

        System.out.println();
        System.out.println("Testando ações de cada Jogador: ");

        for (Jogador jogador : listaJogadores) {
            System.out.println("Realizando ação de mover com jogador " + jogador.getNome() + ": " + jogador.mover());
        }
        
        System.out.println();

        for (Jogador jogador : listaJogadores) {
            System.out.println("Realizando ação de ataque com jogador " + jogador.getNome() + ": " + jogador.atacar());
        }
        
    }
}