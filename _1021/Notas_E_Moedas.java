/* 
 *      Leia um valor de ponto flutuante com duas casas decimais.
 *          Este valor representa um valor monetário.
 *          A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 *          As notas consideradas são de 100, 50, 20, 10, 5, 2.
 *          As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 *  
 *      Entrada
 *          O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 *  
 *       Saída
 *          Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
 *  
 *      Obs: Utilize ponto (.) para separar a parte decimal.
 *  
 *    Exemplo de Entrada  |	Exemplo de Saída
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
            double nota_De_1;
            double nota_De_2;
            double nota_De_5;
            double nota_De_10;
            double nota_De_20;
            double nota_De_50;
            double nota_De_100;

            double resto;

            if (valor < 1000000 & valor > 0) {

                nota_De_100 = (int) valor / 100;
                resto = valor % 100;

                nota_De_50 = (int) (resto / 50);
                resto = resto % 50;

                nota_De_20 = (int) (resto / 20);
                resto = resto % 20;

                nota_De_10 = (int) (resto / 10);
                resto = resto % 10;

                nota_De_5 = (int) (resto / 5);
                resto = resto % 5;

                nota_De_2 = (int) (resto / 2);
                resto = resto % 2;

                nota_De_1 = (int) (resto / 1);
                resto = resto % 1;

                System.out.println(valor
                        + "\n"
                        + nota_De_100 + " nota(s) de R$ 100,00\n"
                        + nota_De_50 + " nota(s) de R$ 50,00\n"
                        + nota_De_20 + " nota(s) de R$ 20,00\n"
                        + nota_De_10 + " nota(s) de R$ 10,00\n"
                        + nota_De_5 + " nota(s) de R$ 5,00\n"
                        + nota_De_2 + " nota(s) de R$ 2,00\n"
                        + nota_De_1 + " nota(s) de R$ 1,00");
            }
        }

    }
}

