/* 
 *  Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 *
 *      MaioirAB= ( a+b+abs(a-b) )
 *     ----------------------------
 *                 2
 *
 *  Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 *  
 *  Entrada
 *  O arquivo de entrada contém três valores inteiros.
 *  
 *  Saída
 *  Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 *  
 *  Exemplos de Entrada     |	Exemplos de Saída
 *      7 14 106            |    106 eh o maior
 *  
 *  
 * 
 * 
 * 
 * 
 */

package _1013;

import java.util.Scanner;

public class O_Maior {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int maior;

            if (a > b & a > c) {

                maior = a;

            } else if (b > c) {

                maior = b;

            } else {

                maior = c;
            }

            System.out.println(maior + " eh o maior");
        }
    }

}
