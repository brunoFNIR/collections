package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
           //key     valor
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println();

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); // mesmo comando para adicionar um novo elemento no map, mas como a key "gol" ja existe, apenas substitui o valor que era 14.4 e passa a ser 15.2
        System.out.println(carrosPopulares.toString());

        System.out.println();

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println();

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println();

        System.out.println("Exiba o terceiro modelo adicionado: " ); //não tem um método que possa mostrar

        System.out.println();

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();// keySet retorna um Set
        System.out.println(modelos);

        System.out.println();

        System.out.println("Exiba os consumos do carros: ");
        Collection<Double> consumos = carrosPopulares.values();// retorna uma Collection
        System.out.println(consumos);

        System.out.println();

        System.out.println("Exiba o modelo mais economico: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); //pega o maior valor dentro dos elementos de carrosPopulares
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//retorna um Set com elementos do tipo Entry
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();

        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println();

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet(); //retorna um Set para que dentro dele, eu possa manipular chaves e valores separademente
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: entries1) {
            if(entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();

        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

        System.out.println();

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println();

        System.out.println("Exiba a média dos consumos deeste dicionário de carros: " + soma / carrosPopulares.size());

        System.out.println();

        System.out.println("Remova os modelos com o consumo igual a 15.6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){ // ou inves desse while, poderia ser "carrosPopulares.values().removeIf(aDouble -> aDouble == 15.6);"
            if(iterator1.next() == 15.6)
                iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println();

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopularesEmOrdem = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopularesEmOrdem.toString());

        System.out.println();

        System.out.println("Exiba o dicionário ordenado pelo modelo"); //modelo é a key, quem ordena a key é o TreeMap
        Map<String, Double> carrosPopularesTreeMap = new TreeMap<>(carrosPopularesEmOrdem);
        System.out.println(carrosPopularesTreeMap.toString());

        System.out.println();

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
