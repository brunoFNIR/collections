package set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        return genero;
    }
}
