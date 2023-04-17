package map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem Aleatória: (mostrando autor e título)");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Harari, Yuval Noa", new Livro("21 Lições para o Século 21", 432));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        }};
        Set<Map.Entry<String, Livro>> entries = meusLivros.entrySet();
        for (Map.Entry<String, Livro> livro: entries) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();

        System.out.println("Ordem de Inserção: ");
        Map<String, Livro> meusLivrosEmOrdem = new LinkedHashMap<>(){{
            put("Harari, Yuval Noa", new Livro("21 Lições para o Século 21", 432));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        }};
        Set<Map.Entry<String, Livro>> entries1 = meusLivrosEmOrdem.entrySet();
        for (Map.Entry<String, Livro> livro: entries1) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();

        System.out.println("Ordem Alfabética autores: ");//autor é a key, portanto utilizamos TreeMap que ordenas em ordem alfabética de acordo com a key, naturalmente
        Map<String, Livro> meusLivrosOrdemAlfabeticaAutor = new TreeMap<>(meusLivrosEmOrdem);
        Set<Map.Entry<String, Livro>> entries2 = meusLivrosOrdemAlfabeticaAutor.entrySet();
        for (Map.Entry<String, Livro> livro: entries2){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();

        System.out.println("Ordem Alfabética nome dos livros: "); // trabalhar com TreeSet para usarmos um Comparator
        Set<Map.Entry<String, Livro>> meusLivrosOrdemAlfabeticaTitulo = new TreeSet<>(new ComparatorNome());
        meusLivrosOrdemAlfabeticaTitulo.addAll(meusLivros.entrySet()); //populando TreeSet com o entrySet de meusLivros
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemAlfabeticaTitulo){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println();

        System.out.println("Ordem numérica de páginas: ");
        Set<Map.Entry<String, Livro>> meusLivrosOrdemNumericaPaginas = new TreeSet<>(new ComparatorPaginas());
        meusLivrosOrdemNumericaPaginas.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemNumericaPaginas){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
    }
}
