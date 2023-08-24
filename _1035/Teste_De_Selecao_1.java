/* 
 *    Leia 4 valores inteiros A, B, C e D. 
 *    A seguir, se B for maior do que C 
 *      e se D for maior do que A,
 *      e a soma de C com D 
 *      for maior que a soma de A e B 
 *          e se C e D, 
 *        ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 *   
 *   Entrada 
 *   Quatro números inteiros A, B, C e D. 
 *   
 *   Saída
 *   Mostre a respectiva mensagem após a validação dos valores.
 * 
 *       Exemplo de Entrada	  |   Exemplo de Saída
 *                5 6 7 8     | Valores nao aceitos
 *
*/

package _1035;

import java.util.Scanner;

public class Teste_De_Selecao_1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (b > c & d > a) {

                if ((c + d) > (a + b)) {
                    if (c > 0 & d > 0) {
                        if (a % 2 == 0) {

                            System.out.println("Valores aceitos");
                        } else {
                            System.out.println("Valores nao aceitos");
                        }
                    } else {
                        System.out.println("Valores nao aceitos");
                    }
                } else {
                    System.out.println("Valores nao aceitos");
                }

            } else {
                System.out.println("Valores nao aceitos");
            }

        }

    }
}
