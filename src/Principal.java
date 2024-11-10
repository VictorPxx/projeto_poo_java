import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("La La Land");
        filme1.setIncluidoNoPlano(true);
        filme1.setAnoDeLancamento(2017);
        filme1.setDuracaoEmMinutos(128);
        filme1.exibeFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(7);
        filme1.avalia(7);
        System.out.printf("Média: %.1f\n", filme1.pegaMedia());
        System.out.printf("Total de avaliações: %d\n", filme1.getTotalDeAvaliacoes());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        System.out.println("\n");

        Serie serie1 = new Serie();
        serie1.setNome("Sienfield");
        serie1.setAnoDeLancamento(1989);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(9);
        serie1.setMinutosPorEpisodio(22);
        serie1.setEpisodiosPorTemporada(8);
        System.out.println("\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiNaCalculadora(filme1);
        calculadora.incluiNaCalculadora(serie1);
        System.out.println("Total de tempo necessário: " + calculadora.getTempoTotal() + " minutos");

        Episodio episodio = new Episodio();
        episodio.setId(1);
        episodio.setSerie(serie1);
        episodio.setTotalDeVisualizacoes(20);
        System.out.println("\n");

        var filme2 = new Filme();
        filme2.setNome("Esqueceram de Mim");
        filme2.setIncluidoNoPlano(true);
        filme2.setAnoDeLancamento(1990);
        filme2.setDuracaoEmMinutos(103);
        filme2.exibeFichaTecnica();
        filme2.avalia(10);
        filme2.avalia(9);
        filme2.avalia(8);
        filme2.avalia(10);
        System.out.printf("Média: %.1f\n", filme1.pegaMedia());
        System.out.printf("Total de avaliações: %d\n\n", filme1.getTotalDeAvaliacoes());

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        System.out.println(listaDeFilmes);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " elementos");
        System.out.println("Primeiro " + listaDeFilmes.get(0));
    }
}
