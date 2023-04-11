package list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        //List notas = new ArrayList(); //feita antes do java 5

        System.out.println("Adicione 7 notas: ");
        List<Double> notas = new ArrayList<>(); //lista com elementos do tipo double

        notas.add(10.0);
        notas.add(9.5);
        notas.add(7.5);
        notas.add(6.0);
        notas.add(5.5);
        notas.add(8.5);
        notas.add(4.5);

        System.out.println(notas);//ou
        //System.out.println(notas.toString()); IMPRIMEM IGUAL

        System.out.println("Exiba a posição da nota 5.5: " + notas.indexOf(5.5));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);

        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.5 pela nota 6.0: ");
        notas.set(notas.indexOf(5.5), 6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: "); //por ser arraylist, ja fica na ordem naturalmente
        for (Double nota: notas) {
            System.out.println(nota);
        }*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //clase Collections tem esse método min, p/ saber a menor nota dentro de uma collection, e a list é uma collection

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){ //enquanto tiver um proximo elemento
            Double next = iterator.next();
            soma += next;
            //PODERIA SER
            /* soma += notas.iterator().next();*/
            //SÓ ESTÁ DIVINDO EM VÁRIAVEIS DO JEITO UTILIZADO
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 4.5: ");
        notas.remove(4.5); // pode ser pelo elemento, ou a posição

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);

        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
