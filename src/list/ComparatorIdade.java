package list;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade()); //idade não é do tipo String, portanto o compareToIgnoreCase() não funciona
    }
}
