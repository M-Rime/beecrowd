/* - 1002
 * 
 * A fórmula para calcular a área de uma circunferência é: area = π * raio^2. 
 * Considerando para este problema que π = 3.14159: 
 * Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π
 * 
 * Entrada
 *  A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
 * 
 *  Saída
 *      Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. 
 *      Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 *      caso contrário, você receberá "Presentation Error".
 * 
 *      Exemplos
 *      
 *      Entrada                   |   Saída
 *          2.00                  |     A=12.5664
 *          100.64                |     A=31819.3103
 *          150.00                |     A=70685.7750
 *  
 */

package _1002;

import java.util.Scanner;

public class Area_Do_Circulo {

    public static void main(String[] args) {

        double pi = 3.14159;
        double area;
        double raio;

        try (Scanner s = new Scanner(System.in)) {

            raio = s.nextDouble();

            area = pi * Math.pow(raio, 2);
            ;

        }

        System.out.printf("A=%.4f%n", area);

    }

}
