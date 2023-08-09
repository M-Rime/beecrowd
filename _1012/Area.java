/* 
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * 
 * [OK] a) a área do triângulo retângulo que tem A por base e C por altura. -> [base * altura / 2 ].
 * 
 * [OK] b) a área do círculo de raio C. (pi = 3.14159) - > [ pir * raio^2 ].
 * 
 * [OK] c) a área do trapézio que tem A e B por bases e C por altura. -> ( ( Base maior + Base Meor ) * Altura ) / 2 
 *                                                                    Para calcular a área de um trapézio basta somar a base maior e base menor,
 *                                                                    multiplicar pela altura e depois, basta dividir o resultado por dois.
 * 
 * d) a área do quadrado que tem lado B. -> A área do quadrado, um caso particular de quadrilátero, pode ser calculada elevando seu lado ao quadrado.
 *                                          A área do quadrado é igual à medida do seu lado ao quadrado.
 * 
 * e) a área do retângulo que tem lados A e B.
 * 
 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o ponto decimal.
 * 
 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 *  
 *          Exemplos de Entrada	 | Exemplos de Saída
 *          3.0 4.0 5.2          |  TRIANGULO: 7.800
 *                               |  CIRCULO: 84.949
 *                               |  TRAPEZIO: 18.200
 *                               |  QUADRADO: 16.000
 *                               |  RETANGULO: 12.000  
 *                                                                                    
*/

package _1012;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double pi = 3.14159;

            double triangulo = (a * c) / 2;
            double circulo = pi * Math.pow(c, 2);
            double trapezio = ((a + b) * c) / 2;
            double quadrado = Math.pow(b, 2);
            double retangulo = a * b;

            System.out.printf("TRIANGULO: %.3f%n", triangulo);
            System.out.printf("CIRCULO: %.3f%n", circulo);
            System.out.printf("TRAPEZIO: %.3f%n", trapezio);
            System.out.printf("QUADRADO: %.3f%n", quadrado);
            System.out.printf("RETANGULO: %.3f%n", retangulo);
        }

    }

}
