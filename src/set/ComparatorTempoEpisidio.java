package set;

import java.util.Comparator;

public class ComparatorTempoEpisidio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int tempoEpisodio = serie1.getTempoEpisodio().compareTo(serie2.getTempoEpisodio());
        if(tempoEpisodio != 0)
            return tempoEpisodio;

        //SENAO
        int nome = serie1.getNome().compareToIgnoreCase(serie2.getNome());
            return nome;
    }
}
