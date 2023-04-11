package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0); // por repetir o "7", só um entra
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println();

        /*System.out.println("Exiba a posição da nota 5.0: ");*/  //Não da

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5.0));
        System.out.println();

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println();

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println();

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Exiba a média das notas: " + soma/notas.size());
        System.out.println();

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println();

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println();

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(); // para saber a ordem precisa ser um linkedHashSet, com a hasehSet não da
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0); // por repetir o "7", só um entra
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2); //LinkedHashSet já vai na ordem
        System.out.println();

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); //TreeSet coloca na ordem crescente naturalmente
        System.out.println(notas3);
        System.out.println();

        System.out.println("Apague todo  conjunto: ");
        notas.clear();
        System.out.println(notas);
        System.out.println();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: "+ notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: "+ notas3.isEmpty());
    }
}
