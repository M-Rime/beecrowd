/* 
 *      Leia um valor de ponto flutuante com duas casas decimais.
 *          Este valor representa um valor monetário.
 *          A seguir. calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 *          As notas consideradas são de 100. 50. 20. 10. 5. 2.
 *          As moedas possíveis são de 1. 0.50. 0.25. 0.10. 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 *  
 *      valor
 *          O arquivo de valor contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 *  
 *       Saída
 *          Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial. conforme exemplo fornecido.
 *  
 *      Obs: Utilize ponto (.) para separar a parte decimal.
 *  
 *    Exemplo de valor  |	Exemplo de Saída
 *     576.73             | NOTAS:
 *                        | 5 nota(s) de R$ 100.00
 *                        | 1 nota(s) de R$ 50.00
 *                        | 1 nota(s) de R$ 20.00
 *                        | 0 nota(s) de R$ 10.00
 *                        | 1 nota(s) de R$ 5.00
 *                        | 0 nota(s) de R$ 2.00
 *                        | MOEDAS:
 *                        | 1 moeda(s) de R$ 1.00
 *                        | 1 moeda(s) de R$ 0.50
 *                        | 0 moeda(s) de R$ 0.25
 *                        | 2 moeda(s) de R$ 0.10
 *                        | 0 moeda(s) de R$ 0.05
 *                        | 3 moeda(s) de R$ 0.01
 * 
*/

package _1021;

import java.util.Scanner;

public class Notas_E_Moedas {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double valor = sc.nextDouble();

            int nota_De_2;
            int nota_De_5;
            int nota_De_10;
            int nota_De_20;
            int nota_De_50;
            int nota_De_100;

            int moeda_De_1;
            int moeda_De_50;
            int moeda_De_25;
            int moeda_De_10;
            int moeda_De_5;
            float moeda_De_01;

            double temp;

            if (valor < 1000000 && valor > 0) {

                nota_De_100 = (int) valor / 100;

                temp = valor % 100;

                nota_De_50 = (int) (temp / 50);

                temp = temp % 50;

                nota_De_20 = (int) (temp / 20);

                temp = temp % 20;

                nota_De_10 = (int) (temp / 10);

                temp = temp % 10;

                nota_De_5 = (int) (temp / 5);

                temp = temp % 5;

                nota_De_2 = (int) (temp / 2);

                temp = temp % 2;

                moeda_De_1 = (int) (temp / 1);

                temp = temp % 1;

                double moeda = (valor - (int) valor);

                moeda_De_50 = (int) (moeda / 0.50);

                moeda = moeda % 0.50;

                moeda_De_25 = (int) (moeda / 0.25);

                moeda = moeda % 0.25;

                moeda_De_10 = (int) (moeda / 0.10);

                moeda = moeda % 0.10;

                moeda_De_5 = (int) (moeda / 0.05);

                moeda = moeda % 0.05;

                moeda_De_01 = (float) (moeda / 0.01);

                System.out.println("NOTAS:\n"
                        + nota_De_100 + " nota(s) de R$ 100.00\n"
                        + nota_De_50 + " nota(s) de R$ 50.00\n"
                        + nota_De_20 + " nota(s) de R$ 20.00\n"
                        + nota_De_10 + " nota(s) de R$ 10.00\n"
                        + nota_De_5 + " nota(s) de R$ 5.00\n"
                        + nota_De_2 + " nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + moeda_De_1 + " moeda(s) de R$ 1.00\n"
                        + moeda_De_50 + " moeda(s) de R$ 0.50\n"
                        + moeda_De_25 + " moeda(s) de R$ 0.25\n"
                        + moeda_De_10 + " moeda(s) de R$ 0.10\n"
                        + moeda_De_5 + " moeda(s) de R$ 0.05");
                System.out.printf("%.0f%s%n", moeda_De_01, " moeda(s) de R$ 0.01");

            }
        }

    }
}
