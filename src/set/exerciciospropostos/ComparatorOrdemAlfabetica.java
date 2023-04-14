package set.exerciciospropostos;

import java.util.Comparator;

public class ComparatorOrdemAlfabetica implements Comparator<String> {

    @Override
    public int compare(String cor1, String cor2) {
        String primeiraLetraCor1 = String.valueOf(cor1.charAt(0));
        String primeiraLetraCor2 = String.valueOf(cor2.charAt(0));

        int primeiraLetra = primeiraLetraCor1.compareTo(primeiraLetraCor2);
        if(primeiraLetra != 0)
            return primeiraLetra;

        //SENAO
        String segundaLetraCor1 = String.valueOf(cor1.charAt(1));
        String segundaLetraCor2 = String.valueOf(cor2.charAt(1));

        int segundaLetra = segundaLetraCor1.compareTo(segundaLetraCor2);
        return segundaLetra;
    }
}
