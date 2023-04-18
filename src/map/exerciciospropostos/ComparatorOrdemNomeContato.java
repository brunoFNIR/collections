package map.exerciciospropostos;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
        return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
    }
}
