/* 
 *                                                                             Lanche
 * 
 *      Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 *      __________________________________________
 *     | CODIGO  |  ESPECIFICAÇÃO   |  PREÇO      |
 *     |------------------------------------------|
 *     |     1   | CACHORRO QUENTE  | R$ 4.00     |
 *     |     2   | X-SALADA         | R$ 4.50     |
 *     |     3   | X-BACON          | R$ 5.00     |
 *     |     4   | TORRADA SIMPLES  | R$ 2.00     |
 *     |     5   | REFRIGERANTE     | R$ 1.50     |
 *     --------------------------------------------    
 * 
 *   Entrada
 *  O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
 * 
 *   Saída
 *  O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 * 
 * 
 * Exemplo de Entrada | Exemplo de Entrada | 
 *             3 2    | Total: R$ 10.00
 * 
*/

package _1038;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int id_Produto = sc.nextInt();
            int quantidade_Produto = sc.nextInt();

            double id_1 = 4;
            double id_2 = 4.50;
            double id_3 = 5;
            double id_4 = 2;
            double id_5 = 1.5;

            switch (id_Produto) {
                case 1: {
                    System.out.printf("Total: R$ %.2f%n", (id_1 * quantidade_Produto));
                    break;
                }
                case 2: {
                    System.out.printf("Total: R$ %.2f%n", (id_2 * quantidade_Produto));
                    break;
                }
                case 3: {
                    System.out.printf("Total: R$ %.2f%n", (id_3 * quantidade_Produto));
                    break;
                }
                case 4: {
                    System.out.printf("Total: R$ %.2f%n", (id_4 * quantidade_Produto));
                    break;
                }
                case 5: {
                    System.out.printf("Total: R$ %.2f%n", (id_5 * quantidade_Produto));
                    break;
                }

                default:
                    break;
            }

        }
    }
}
