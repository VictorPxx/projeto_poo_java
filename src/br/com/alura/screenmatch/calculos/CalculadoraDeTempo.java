package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiNaCalculadora(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
