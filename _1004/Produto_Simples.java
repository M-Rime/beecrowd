/* 
 * 
 * 
 *  Leia dois valores inteiros.
 *  A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
 *  A seguir mostre a variável PROD com mensagem correspondente.   
 *
 *      Entrada
 *          O arquivo de entrada contém 2 valores inteiros.
 *
 *      Saída
 *          Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 *          Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 * 
 *                      
 *                       Entrada       Saida
 *                         3       | 
 *                         9       |  PROD = 27 
 *  
 */

package _1004;

import java.util.Scanner;

public class Produto_Simples {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            int prod = a * b;

            System.out.println("PROD = " + prod);
        }

    }

}
