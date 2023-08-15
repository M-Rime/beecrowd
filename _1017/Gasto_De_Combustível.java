/* 
 *  Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. 
 * 
 *  Para isso, ele gostaria que você o auxiliasse através de um simples programa.
 * 
 *  Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)
 *  e a velocidade média durante a mesma (em km/h).
 * 
 *  Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários.
 *  Mostre o valor com 3 casas decimais após o ponto.
 * 
 * Entrada
 * O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).
 * 
 * Saída
 * Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal 
 * 
 * Exemplo de Entrada  | Exemplo de Saída
 *              10     |    70.833
 *              85     | 
 * 
 *------------------------------------------------------  
 * Objetivo: Joãozinho está planejando uma viagem de carro e deseja calcular a quantidade de litros de combustível que ele precisará utilizar durante essa viagem. Ele sabe que o carro faz 12 quilômetros por litro (12 KM/L).
 *   
 *   Dados fornecidos: Para calcular a quantidade de litros necessários, Joãozinho precisa fornecer duas informações:
 *   
 *   Tempo gasto na viagem (em horas): Isso é quanto tempo ele levará para completar a viagem.
 *   Velocidade média durante a viagem (em km/h): Essa é a velocidade média do carro ao longo da viagem.
 *   Cálculo da distância percorrida: Para calcular a distância percorrida, é utilizado o conceito de que distância é igual ao produto do tempo pela velocidade. Ou seja, Distância = Tempo x Velocidade Média.
 *   
 *   Cálculo da quantidade de litros de combustível: Sabendo que o carro faz 12 KM/L, 
 *   podemos calcular a quantidade de litros de combustível necessários dividindo a distância percorrida pelo consumo do carro.
 *   Ou seja, Litros = Distância / Consumo.
 *
 *   Formato da saída: Joãozinho deseja ver o resultado com três casas decimais após o ponto decimal.
 *
 *
*/

package _1017;

import java.util.Scanner;

public class Gasto_De_Combustível {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int tempo = sc.nextInt();
            int velocidade = sc.nextInt();
            int consumo = 12;

            double distancia = tempo * velocidade;
            double litros = distancia / consumo;

            System.out.printf("%.3f", litros);

        }
    }
}