package list.exerciciospropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExPropostoUm {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int contadorMes = 0;
        while(true){
            if(contadorMes == 6)
                break;


            System.out.println("Digite a temperatura média do " + (contadorMes + 1) + "º mês do ano: ");
            double temp = sc.nextDouble();

            temperaturas.add(temp);
            contadorMes++;
        }
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }

        double mediaSemestral = soma / temperaturas.size();

        System.out.printf("Média Semestral das temperaturas: %.2f",mediaSemestral);
        System.out.println();

        System.out.println("Meses com temperatura a cima da média semestral: ");


        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaSemestral ) {
                double auxTemp = temperaturas.get(i);
                int i1 = temperaturas.indexOf(auxTemp);
                switch (i1){
                    case 0:
                        System.out.println("Janeiro - " + temperaturas.get(i));
                        break;

                    case 1:
                        System.out.println("Fevereiro - " + temperaturas.get(i));
                        break;

                    case 2:
                        System.out.println("Março - " + temperaturas.get(i));
                        break;

                    case 3:
                        System.out.println("Abril - " + temperaturas.get(i));
                        break;

                    case 4:
                        System.out.println("Maio - " + temperaturas.get(i));
                        break;

                    case 5:
                        System.out.println("Junho - " + temperaturas.get(i));
                        break;

                    default:
                        System.out.println("Erro");
                        break;
                }
                /*if (temperaturas.get(i) == 0) {
                    System.out.println("Janeiro" + temperaturas.get(i));
                } else if (temperaturas.get(i) == 1) {
                    System.out.println("Fevereiro" + temperaturas.get(i));
                } else if (temperaturas.get(i) == 2) {
                    System.out.println("Março" + temperaturas.get(i));
                } else if (temperaturas.get(i) == 3) {
                    System.out.println("Abril" + temperaturas.get(i));
                } else if (temperaturas.get(i) == 4) {
                    System.out.println("Maio" + temperaturas.get(i));
                 }else if (temperaturas.get(i) == 5) {
                    System.out.println("Junho" + temperaturas.get(i));
                }*/
            }
        }
    }
}
