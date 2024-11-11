package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme filme1 = new Filme("La La Land",2017);
        filme1.avalia(10);
        var filme2 = new Filme("hahahaha", 2001);
        filme2.avalia(8);
        Serie serie1 = new Serie("Sienfield", 1989);
        var filme3 = new Filme("Esqueceram de Mim", 1990);
        filme3.avalia(6);
        ArrayList<Titulo> lista = new ArrayList<>();
        Filme referenciaFilme = filme1;
        lista.add(referenciaFilme);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for(Titulo item: lista) {
            System.out.println("Nome: " + item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 3) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

//        if(referenciaFilme == filme1) {
//            System.out.println("Iguais");
//        } else {
//            System.out.println("Diferentes");
//        }
    }
}
