/* - 1001 
 *  
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
 *  Efetue a soma de A e B atribuindo o seu resultado na variável X. 
 *  Imprima X conforme exemplo apresentado abaixo.
 *  Não apresente mensagem alguma além daquilo que está sendo especificado e 
 *  não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 * 
 */

package _1001;

import java.util.Scanner;

public class Extremamente_Basico {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            var a = s.nextInt();

            int b = s.nextInt();

            int x = a + b;

            System.out.println("X = " + x);
        }

    }

}