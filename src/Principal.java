import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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
        filme1.avalia(5);
        System.out.printf("Média: %.1f", filme1.pegaMedia());
        System.out.printf("\nTotal de avaliações: " + filme1.getTotalDeAvaliacoes());

        Serie serie1 = new Serie();
        serie1.setNome("Sienfield");
        serie1.setAnoDeLancamento(1989);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(9);
        serie1.setMinutosPorEpisodio(22);
        serie1.setEpisodiosPorTemporada(8);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiNaCalculadora(filme1);
        calculadora.incluiNaCalculadora(serie1);
        System.out.println("Total de tempo necessário: " + calculadora.getTempoTotal() + " minutos");
    }
}
