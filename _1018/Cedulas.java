/* 
 * Leia um valor inteiro.
 * A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 * 
 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 * 
 * Exemplo de Entrada	| Exemplo de Saída
 * 576                  | 576
 *                      | 5 nota(s) de R$ 100,00
 *                      | 1 nota(s) de R$ 50,00
 *                      | 1 nota(s) de R$ 20,00
 *                      | 0 nota(s) de R$ 10,00
 *                      | 1 nota(s) de R$ 5,00
 *                      | 0 nota(s) de R$ 2,00
 *                      | 1 nota(s) de R$ 1,00
 * 
 * 
*/

package _1018;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int valor = sc.nextInt();
            int nota_De_1;
            int nota_De_2;
            int nota_De_5;
            int nota_De_10;
            int nota_De_20;
            int nota_De_50;
            int nota_De_100;

            float temp, resto;

            if (valor < 1000000 & valor > 0) {
                nota_De_100 = valor / 100;
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
