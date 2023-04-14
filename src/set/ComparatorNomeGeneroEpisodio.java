package set;

import java.util.Comparator;

public class ComparatorNomeGeneroEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if(nome != 0) // se os nomes forem diferente, compara por nome
            return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) //se não compara por genero
            return genero;

        //ELSE
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio()); // se o nome e o genero forem iguais, compara por tempoEpisodio
    }
}
