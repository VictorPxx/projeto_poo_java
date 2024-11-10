package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private String nome;
    private int id;
    private Serie serie;
    private int totalDeVisualizacoes;

    public Episodio(String nome, int anoDeLancamento, Serie serie) {
        super(nome, anoDeLancamento);
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
