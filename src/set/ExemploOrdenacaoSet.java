package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória"); // Set já tem ordem aleatória por natureza
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60 ));
            add(new Serie("dark", "drama", 60 ));
            add(new Serie("that '70s show", "comedia", 25 ));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{ //LinkedHashSet respeita a ordem de inserção, devido a ligação dos Nós
            add(new Serie("got", "fantasia", 60 ));
            add(new Serie("dark", "drama", 60 ));
            add(new Serie("that '70s show", "comedia", 25 ));
        }};

        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem natural (TempoEpisodio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        //System.out.println(minhasSeries2.toString());
        // primeiramente da um erro, por nao ter o Comparable na classe Serie

        /*for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }*/
        // AGORA COM O Comparable implementado na classe Serie
        //PORÉM O Set, NÃO RECEBE ELEMENTOS IGUAIS, E COMO A COMPARAÇÃO ESTA SENDO FEITA ENTRE OS TEMPOS DE EP, ELE APENAS MOSTRA O THAT 'S SHOW (COM 25 MIN DE EP) E O GOT (COM 60 MIN DE EP) A PROXIMA SERIE QUE TBM TEM 60 MIN DE EP, NÃO É MOSTRADA, PORTANTO É NECESSÁRIO ESPECIFICA UM "CRITÉRIO DE DESEMPATE" NO MÉTODO compareTo ORIUNDO DA INTERFACE COMPARABLE NA CLASSE Serie

        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroEpisodio());
        minhasSeries3.addAll(minhasSeries);// addAll adiciona todos os elementos que tem dentro de uma Collection, no caso, "minhasSeries". Porém quando os elementos entram na TreeSet "minhasSeries3, eles são organizados de acordo com o Comparator que definimos na instanciação de "minhasSeries3", no caso, a classe "ComparatorNomeGeneroEpisodio()"
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem genero");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem tempoEpisodio");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisidio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}
