/*  Leia 3 valores de ponto flutuante 
    e efetue o cálculo das raízes da equação de Bhaskara.
    Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
    caso haja uma divisão por 0 ou raiz de numero negativo.
* 
* Entrada
* Leia três valores de ponto flutuante (dolble) A, B e C.
* 
* Saída
* Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
    Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
    Imprima sempre o final de linha após cada mensagem.
* 
*       Exemplos de Entrada	| Exemplos de Saída
*       10.0 20.1 5.1       |    R1 = -0.29788
*                           |    R2 = -1.71212
* 
* Bhaskara
* x=(-b±√(b^2-4ac))/2a
*/

package _1036;

import java.util.Scanner;

public class Fórmula_De_Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double x1 = 0;
        double x2 = 0;
        double delta = Math.pow(b, 2) - (4 * a * c);
        double raizDelta = Math.sqrt(delta);

        if (delta <= 0) {
            System.out.println("Impossivel calcular");
        } else {

            System.out.println("-b :" + -(b));
            System.out.println("Rais de Delta :" + raizDelta);
            System.out.println("2 * a : " + 2 * a);

            b = b * -1;
            x1 = (b + raizDelta) / (2 * a);
            x2 = (b - raizDelta) / (2 * a);

        }

        System.out.printf("%.5f%n R1 = ", x1);
        System.out.printf("%.5f%n R2 = ", x2);

    }
}
