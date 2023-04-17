package map.exerciciospropostos;

import java.util.*;

public class ExercicioEstadosNordeste {
    public static void main(String[] args) {
        Map<String, Integer> estadosNordeste = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        Set<Map.Entry<String, Integer>> entries = estadosNordeste.entrySet();
        for (Map.Entry<String, Integer> estado: entries) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Substitua a população do estado do RN por 3534165");
        estadosNordeste.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado: entries) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4039277");
        if (!estadosNordeste.containsKey("PB"))
            estadosNordeste.put("PB", 4039277);
        for (Map.Entry<String, Integer> estado: entries) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Exiba a população de PE: ");
        for (Map.Entry<String, Integer> estado: entries) {
            if(estado.getKey().equals("PE"))
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Exiba os estados e suas populações na ordem em que foi inserido: ");
        Map<String, Integer> estadosNordesteOrdemInsercao = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        Set<Map.Entry<String, Integer>> entries1 = estadosNordesteOrdemInsercao.entrySet();
        for (Map.Entry<String, Integer> estado: entries1) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estadosNordesteOrdemAlfabetica = new TreeMap<>(estadosNordesteOrdemInsercao);
        Set<Map.Entry<String, Integer>> entries2 = estadosNordesteOrdemAlfabetica.entrySet();
        for (Map.Entry<String, Integer> estado: entries2) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Exiba o estado com menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(estadosNordesteOrdemInsercao.values());
        for (Map.Entry<String, Integer> estado: entries1) {
            if (estado.getValue().equals(menorPopulacao))
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Exiba o estado com maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(estadosNordesteOrdemInsercao.values());
        for (Map.Entry<String, Integer> estado: entries1) {
            if (estado.getValue().equals(maiorPopulacao))
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        Iterator<Integer> iterator = estadosNordesteOrdemInsercao.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println();

        System.out.println("Exiba a média de população: " + soma / estadosNordesteOrdemInsercao.size());

        System.out.println();

        System.out.println("Remova os estados com população menor que 4000000");
        Iterator<Integer> iterator1 = estadosNordesteOrdemInsercao.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000)
                iterator1.remove();
        }
        for (Map.Entry<String, Integer> estado: entries1) {
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println();

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estadosNordesteOrdemInsercao.clear();

        System.out.println();

        System.out.println("Confira se a lista está vazia: " + estadosNordesteOrdemInsercao.isEmpty());
    }
}
