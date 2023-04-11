package list;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor()); //por cor ser um atributo String, é possivel utilizar "compareToIgnoreCase()"
    }
}
