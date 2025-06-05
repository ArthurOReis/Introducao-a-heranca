package org.example.Exercicios.ExercicioDois;

public class Linha extends Forma {

    public Linha(String corDeLinha, String corDePreenchimento) {
        super(corDeLinha, corDePreenchimento);
    }

    @Override
    public String desenhar() {
        return "Linha: cor de linha = " + getCorDeLinha() + ", cor de preenchimento = " + getCorDePreenchimento();
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        if (getCoordenadas().size() >= 2) {
            Coordenada p1 = getCoordenadas().get(0);
            Coordenada p2 = getCoordenadas().get(1);
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }
        return 0;
    }
}
