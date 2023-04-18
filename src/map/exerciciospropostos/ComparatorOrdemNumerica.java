package map.exerciciospropostos;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
        return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
    }
}
