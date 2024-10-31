import br.com.alura.screenmatch.modelos.Filme;

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
    }
}
