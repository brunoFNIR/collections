package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /*numerosAleatorios.forEach(s -> System.out.println(s));*/  //ANTES DE TRANSFORMAR LAMBDA EM REFERENCE METHOD
        numerosAleatorios.forEach(System.out::println); //APOS TRANSFORMAÇÃO

        System.out.println();

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                            .limit(5) //pegue os 5 primeiros números de "numerosAleatorios
                                .collect(Collectors.toSet()) //coloque em um Set
                                    .forEach(System.out::println); // imprima cada um dos números
                                    //como o numero "1" se repeta, ele coloca no Set apenas um deles

        System.out.println();

        System.out.println("Transforme essa lista de Strings em uma lista de números inteiros: ");
        List<Integer> numerosAleatoriosInteger = new java.util.ArrayList<>(numerosAleatorios.stream()
                                                                                                .map(Integer::parseInt) //usa o parseInt em cada elemento
                                                                                                    .toList());

        numerosAleatoriosInteger.forEach(System.out::println);

        System.out.println();

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> numerosParesMaioresDois = numerosAleatoriosInteger.stream()
                                                                            .filter(integer -> (integer % 2 == 0 && integer > 2 )) //filtro
                                                                                .toList();

        numerosParesMaioresDois.forEach(System.out::println);

        System.out.println();

        System.out.println("Mostre a média dos números: ");

        numerosAleatorios.stream() // STREAM NÃO MUDA A FONTE
                            .mapToInt(Integer::parseInt) //transforma a stream dos elementos da lista em inteiros
                                .average()   //faz a média deles
                                    .ifPresent(System.out::println); //se a media estiver presente, imprime ela na tema

        System.out.println();

        System.out.println("Remova os valores impares: ");
        numerosAleatoriosInteger.removeIf(numero -> (numero % 2 != 0));
        numerosAleatoriosInteger.forEach(System.out::println);

        System.out.println();

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima os restantes: ");
        numerosAleatorios.stream()
                            .skip(3)
                                .forEach(System.out::println);

        System.out.println();

        System.out.println("Retirando os números repetidos da lista, quantos números ficam: "
                                                                        + numerosAleatorios.stream().distinct().count());

        System.out.println();

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatorios.stream()
                            .mapToInt(Integer::parseInt)
                                .min()
                                    .ifPresent(System.out::println);

        System.out.println();

        System.out.println("Mostre o maior valor da lista: ");
        numerosAleatorios.stream()
                            .mapToInt(Integer::parseInt)
                                .max()
                                    .ifPresent(System.out::println);

        System.out.println();

        System.out.println("Pegue apenas os número impares e some: ");
        int somaImpares = numerosAleatorios.stream()
                                        .mapToInt(Integer::parseInt)
                                            .filter(numero -> numero % 2 != 0)
                                                .sum();

        System.out.println(somaImpares);

        System.out.println();

        System.out.println("Mostre a lista na ordem numérica: ");
        List<Integer> ordemNatural = numerosAleatorios.stream()
                                                    .map(Integer::parseInt)
                                                        .sorted(Comparator.naturalOrder())
                                                            .toList();

        ordemNatural.forEach(System.out::println);

        System.out.println();

        System.out.println("Agrupe os valores impares multiplos de 3 e de 5: ");
        Map<Boolean, List<Integer>> multiplosDeTresECinco = numerosAleatorios.stream()
                                                                                .map(Integer::parseInt)
                                                                                    .collect(Collectors.groupingBy(integer ->(integer % 2 != 0) &&(integer % 3 == 0 || integer % 5 == 0)));
        System.out.println(multiplosDeTresECinco);
    }
}
