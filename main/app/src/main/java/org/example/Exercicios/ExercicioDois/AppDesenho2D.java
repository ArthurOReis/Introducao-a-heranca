package org.example.Exercicios.ExercicioDois;

import java.util.ArrayList;
import java.util.List;

public class AppDesenho2D {
    public static void main(String[] args) {
        List<Forma> listaFormas = new ArrayList<>();

        Linha linha = new Linha("preto", "nenhum");
        linha.getCoordenadas().add(new Coordenada(0, 0));
        linha.getCoordenadas().add(new Coordenada(3, 4));
        listaFormas.add(linha);

        Retangulo retangulo = new Retangulo("azul", "amarelo", 5, 3);
        listaFormas.add(retangulo);

        Circulo circulo = new Circulo("vermelho", "verde", 2);
        listaFormas.add(circulo);

        System.out.println("***  Desenho Vetorial 2D ***\n");
        for (Forma forma : listaFormas) {
            System.out.println(forma.desenhar());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
