/* 
*     Leia 3 valores inteiros e ordene-os em ordem crescente.
*        No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
*   
*   Entrada
*       A entrada contem três números inteiros.
*   
*   Saída
*       Imprima a saída conforme foi especificado.
*   
*   
*   
*   Exemplo de Entrada	| Exemplo de Saída
*    7 21 -14           | -14   
*                       | 7 
*                       | 21    
*                       |   
*                       | 7 
*                       | 21    
*                       | -14
*   
 * 
 * 
 * 
 * 
 */

package _1042;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Simples {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> lista = new ArrayList<>();
            ArrayList<Integer> lista2 = new ArrayList<>();

            int i = 0;

            while (i != 3) {

                lista.add(sc.nextInt());
                lista2.add(lista.get(i));
                i++;
            }

            lista.sort(null);

            for (Integer x : lista) {

                System.out.println(x);
            }

            System.out.println("");

            for (Integer x : lista2) {

                System.out.println(x);
            }

        }
    }
}

// for (int y = lista.size() - 1; y >= 0; y--) {
// system.out.println(lista.get(y)); }