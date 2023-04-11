package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoGatos {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato("Kiara", 6, "Preto e bege"));
        gatos.add(new Gato("Merry", 8, "Preto"));
        gatos.add(new Gato("Jon", 12, "Branco"));

        System.out.println(gatos.toString());

        System.out.println("Ordem de Inserção");
        System.out.println(gatos.toString());
        System.out.println();

        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("Ordem natural: ");
        Collections.sort(gatos); // o sort direto da List, não usa a interface Comparable, por isso, precisa ser o sort de Collections
        System.out.println(gatos.toString());
        System.out.println();

        System.out.println("Ordem Idade");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos.toString());
        System.out.println();

        System.out.println("Ordem Cor");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos.toString());
        System.out.println();

        System.out.println("Ordem Nome/Cor/Idade");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos.toString());
    }
}
