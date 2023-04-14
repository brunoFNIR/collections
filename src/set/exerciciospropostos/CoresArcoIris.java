package set.exerciciospropostos;

import list.ComparatorIdade;

import java.util.*;

public class CoresArcoIris {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("anil");
            add("violeta");
        }};

        System.out.println("Cores uma abaixo da outra");
        for (String cor: cores) {
            System.out.println(cor);
        }

        System.out.println();

        System.out.println("Quantidade de cores que o arco-íris tem: " + cores.size());

        System.out.println();

        System.out.println("Exiba as cores em ordem alfabetica");
        Set<String> cores2 = new TreeSet<>(new ComparatorOrdemAlfabetica());
        cores2.addAll(cores);
        for (String cor: cores2) {
            System.out.println(cor);
        }

        System.out.println();

        System.out.println("Exiba as coras na ordem inversa da qual foi informada");
        Set<String> cores3 = new LinkedHashSet<>(cores);
        List<String> cores4 = new ArrayList<>(cores3);
        Collections.reverse(cores4);
        System.out.println(cores4);

        System.out.println();

        System.out.println("Exiba todas as cores que começam com a letra 'v' ");
        for (String cor: cores2) {
            String primeiraLetra = String.valueOf(cor.charAt(0));
            if(primeiraLetra.equalsIgnoreCase("v"))
                System.out.println(cor);
        }

        System.out.println();

        System.out.println("Remova todas as cores que não começam com a letra 'v' ");
        Iterator<String> iterator = cores2.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().startsWith("v"))
                iterator.remove();
        }
        System.out.println(cores2);

        System.out.println();

        System.out.println("Limpe o conjunto");
        cores.clear();
        cores2.clear();
        cores3.clear();
        cores4.clear();

        System.out.println();

        System.out.println("Verifique se o conjunto esta vazio");
        System.out.println(cores.isEmpty());
        System.out.println(cores2.isEmpty());
        System.out.println(cores3.isEmpty());
        System.out.println(cores4.isEmpty());
    }
}
