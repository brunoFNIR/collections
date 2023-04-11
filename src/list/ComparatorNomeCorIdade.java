package list;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;


        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor!= 0) return cor;


        return Integer.compare(gato1.getIdade(), gato2.getIdade());

        //se o nome for igual ele compara por cor, se a cor tbm for igual, ele compara por idade
    }
}
