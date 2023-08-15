/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N.
 * 
 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 * 
 * Exemplo de Entrada |	Exemplo de Saída
 *               556  | 0:9:16
 * 
*/

package _1019;

import java.util.Scanner;

public class Conversao_De_Tempo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double entrada = sc.nextInt();
            double horas = 0;
            double minutos = 0;
            double segundos = 0;

            double temp = 0;

            horas = (int) entrada / 3600;

            minutos = (int) entrada / 60;
            segundos = (minutos / 60);

            System.out.printf("%f%n", horas);
            System.out.printf("%f%n", minutos);
            System.out.printf("%f%n", segundos);

            System.out.println("\nTemp - " + temp);

        }

    }

}