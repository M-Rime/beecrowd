/* 
 *  Leia um valor inteiro correspondente à idade de uma pessoa em dias
 *  e informe-a em anos, meses e dias
 * 
 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 * 
 * Saída
 * Imprima a saída conforme exemplo fornecido.
 * 
 * Exemplo de Entrada	| Exemplo de Saída
 *          400         | 1 ano(s)
 *                      | 1 mes(es)
 *                      | 5 dia(s)
 *  
 */

package _1020;

import java.util.Scanner;

public class Idade_Em_Dias {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int entrada = sc.nextInt();
            int ano = entrada / 365;
            int mes = (entrada % 365) / 30;
            int dias = (entrada % 365) % 30;

            System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)\n");
        }

    }

}
