/* 
 * 
 *  A tarefa aqui neste problema é ler uma expressão matemática na forma de dois números Racionais (numerador / denominador) e apresentar o resultado da operação.
 *      Cada operando ou operador é separado por um espaço em branco.
 *      A sequência de cada linha que contém a expressão a ser lida é: 
 *      número, caractere, número, caractere, número, caractere, número.
 *      A resposta deverá ser apresentada e posteriormente simplificada.
 *      Deverá então ser apresentado o sinal de igualdade e em seguida a resposta simplificada.
 *      No caso de não ser possível uma simplificação, deve ser apresentada a mesma resposta após o sinal de igualdade.
 * 
 * Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação de como deverá ser realizada cada uma das operações:
 * 
 * Soma: (N1*D2 + N2*D1) / (D1*D2)
 * 
 * Subtração: (N1*D2 - N2*D1) / (D1*D2)
 * 
 * Multiplicação: (N1*N2) / (D1*D2)
 * 
 * Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)
 * 
 * Entrada
 * 
 * A entrada contem vários casos de teste. A primeira linha de cada caso de teste contem um inteiro N (1 ≤ N ≤ 1*104), 
 * indicando a quantidade de casos de teste que devem ser lidos logo a seguir.
 * Cada caso de teste contém um valor racional X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro valor racional Y (1 ≤ Y ≤ 1000).
 * 
 * Saída
 * A saída consiste em um valor racional, seguido de um sinal de igualdade e outro valor racional, que é a simplificação do primeiro valor. No caso do primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o sinal de igualdade.
 * 
 * Exemplo de Entrada	Exemplo de Saída
 * 
 * 
 * 
 * 4
 * 1 / 2 + 3 / 4    | 10/8 = 5/4
 * 1 / 2 - 3 / 4    |-2/8 = -1/4
 * 2 / 3 * 6 / 6    |12/18 = 2/3
 * 1 / 2 / 3 / 4    |4/6 = 2/3
 * 
 * 
 * 
 * 
 *                       >>> Algoritmo de Euclides para determinação de MDC – Utilizando Diagramas <<<
 * 
 * 
 *  Podemos indicar as sucessivas divisões do Algoritmo de Euclides de uma maneira mais prática.
 * Vamos exemplificar como isso pode ser feito, utilizando as divisões obtidas no segundo exemplo.
 * 
 * Dividendo/Divisor = Quociente(Resultado)
 * Resto 
 *     
 * 1320 / 35 = 37 | 35 / 25 = 1 | 25 / 10 = 2 | 10 / 5 = 2
 * r : 25         | r : 10      | r : 5       | r : 0
 * 
 * Essas divisões podem ser indicadas, utilizando-se um diagrama semelhante a um “Jogo da Velha ampliado”.
 * Veja:
 * 
 *   37  | 1 | 2 | 2 |   ----> Cociente
 * ----------------------
 *   1320| 35| 25| 10| 5   -----> MDC      
 * ----------------------
 *   25  |10 | 5 | 0 |	    --------> Resto
 * 
 * Observe que:
 * 
 * - Na primeira linha do diagrama, aparecem os quocientes das divisões efetuadas;
 * - Na segunda linha do diagrama, aparecem os divisores e dividendos das divisões efetuadas;
 * - Na terceira linha do diagrama, aparecem os restos das divisões efetuadas.
 * - Pelo diagrama fica fácil de perceber que o MDC dos dois números em questão é o último resto não nulo do processo das divisões sucessivas.
 * 
*/

package _1022;

import java.util.Arrays;
import java.util.Scanner;

public class TDA_Racional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int numeroDeinteracoes = sc.nextInt();

        while (numeroDeinteracoes != 0) {

            String casoDeeste = sc2.nextLine();
            String[] splitCaso = casoDeeste.split(" ");

            System.out.println(Arrays.toString(splitCaso));

            numeroDeinteracoes--;

            switch (splitCaso[3]) {
                case "+": {

                    // index -- 0 , 1, .2, 3, .4, 5, 6
                    // Array - [n1, /, d1, +, n2, /, d2]
                    // Soma: (N1*D2 + N2*D1) / (D1*D2)

                    int numerador = Integer.parseInt(splitCaso[0]) * Integer.parseInt(splitCaso[6])
                            + Integer.parseInt(splitCaso[4]) * Integer.parseInt(splitCaso[2]);

                    int denominador = Integer.parseInt(splitCaso[2]) * Integer.parseInt(splitCaso[6]);

                    int maximoDivisorComun = mdc(numerador, denominador);

                    numerador /= maximoDivisorComun;
                    denominador /= maximoDivisorComun;

                    System.out.println("N :" + numerador + "" + "\n" + "D :" + denominador);

                    break;
                }
                case "-": {

                    // index ------ 0 , 1, .2, 3, .4, 5, 6
                    // Array ----- [n1, /, d1, +, n2, /, d2]
                    // Subtração : (N1*D2 - N2*D1) / (D1*D2)

                    int numerador = Integer.parseInt(splitCaso[0]) * Integer.parseInt(splitCaso[6])
                            - Integer.parseInt(splitCaso[4]) * Integer.parseInt(splitCaso[2]);

                    int denominador = Integer.parseInt(splitCaso[2]) * Integer.parseInt(splitCaso[6]);

                    int maximoDivisorComun = mdc(numerador, denominador);

                    numerador /= maximoDivisorComun;
                    denominador /= maximoDivisorComun;

                    System.out.println("N :" + numerador + "" + "\n" + "D :" + denominador);

                    break;
                }
                case "*": {
                    // index ------ 0 , 1, .2, 3, .4, 5, 6
                    // Array ------[n1, /, d1, +, n2, /, d2]
                    // Multiplicação: (N1*N2) / (D1*D2)

                    break;
                }
                case "/": {

                    break;
                }

                default:
                    break;
            }
        }
    }

    public static int mdc(int dividendo, int divisor) {

        int r = 1;
        while (r != 0) {

            r = dividendo % divisor;

            if (r == 0) {

                return divisor;

            } else {

                dividendo = divisor;
                divisor = r;
            }
        }

        return 0;
    }

}
