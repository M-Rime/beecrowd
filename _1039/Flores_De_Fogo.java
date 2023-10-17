/* 
*                                                       Flores De Fogo
*
*       Nos dias atuais uma flor de fogo não é algo considerado estranho para muitos jovens. 
*   Isso porque um famoso jogo de videogame popularizou esse tipo de flor. 
*   Nesse jogo o protagonista ganhava superpoderes ao tocar em uma flor de fogo, passando a atirar pequenas bolas de fogo para derrotar seus inimigos.
*   
*       No entanto, já se falava sobre flores de fogo há muito tempo atrás.
*   Na mitologia polonesa, flores de fogo são flores místicas de grande poder guardadas por espíritos malignos.
*   Ela possuía esse nome porque brilhava tanto que era impossível olhá-la diretamente.
*   Quem possuísse uma flor dessas ganharia a habilidade de ler a mente de outras pessoas, encontrar tesouros escondidos e repelir todos os males.
*   
*       Para obter uma flor de fogo, a pessoa deveria procurá-la em uma floresta antes da meia-noite na véspera do Noc Kupały.
*   Exatamente à meia-noite ela floresceria. Para colhê-la seria preciso desenhar um círculo em volta dela.
*   Parece uma tarefa fácil, no entanto, os espíritos malignos que guardam a flor tentariam de tudo para distrair qualquer um tentando colher a flor. 
*   Se a pessoa falhasse ao tentar desenhar um círculo em volta da flor, teria sua vida sacrificada.
*   
*       Dados dois círculos, um desenhado por um ambicioso caçador de flores de fogo e outro representando a área da flor,
*   sua tarefa é determinar se o caçador morre ou fica rico com sua conquista.
*   
*   Entrada
*
*       A entrada é composta por diversas instâncias e termina com final de arquivo (EOF).
*   Cada instância consiste em uma linha com seis inteiros, R1 (1 ≤ R1) , X1(|X1|), Y1(|Y1|), R2 (R2 ≤ 1000), X2(|X2|), Y2 (Y2 ≤ 1000). O círculo desenhado pelo caçador possui raio R1 e centro (X1; Y1). O círculo representando a área da flor possui raio R2 e centro (X2; Y2).
*     
*   Saída
*   Para cada instância imprima uma única linha contendo MORTO, se o caçador morre, ou RICO se o caçador consegue colher a flor.
*   
*   
*   Exemplo de Entrada  | Exemplo de Saída
*   6 -8 2 3 0 0        |  MORTO
*   7 3 4 2 4 5         |  RICO
*   3 0 0 4 0 0         |  MORTO
*   5 4 7 1 8 7         |  RICO
*    
*/

/* 
 *   1 - Círculos e seus Centros:
 *          Um círculo é definido por seu centro (coordenadas X e Y) e seu raio (R).
 *          O centro é o ponto central do círculo, e o raio é a distância do centro a qualquer ponto da circunferência.
 *   
 *  2 - Distância entre os Centros:
 *          A fórmula da distância entre dois pontos é usada para calcular a distância entre os centros dos dois círculos. Isso nos dá a distância entre os dois círculos.
 *   
 *  3 - Comparação de Raios:
 *          Para verificar se um círculo está completamente contido em outro, é fundamental comparar os raios dos círculos e a distância entre seus centros.
 *   Se a distância entre os centros for menor que a diferença entre os raios, isso significa que o círculo interno cabe completamente no círculo externo.
 *   
 * 4 - Justificativa:  
 *          Quando a distância entre os centros é menor que a diferença entre os raios, significa que não há sobreposição entre os dois círculos.
 *          O círculo menor pode ser colocado dentro do círculo maior sem tocar na borda do círculo maior.
 *   
 *      Em resumo, essa fórmula é uma maneira matemática de verificar se um círculo está inteiramente contido dentro de outro,
 *          levando em consideração o centro e o raio de cada círculo. Se a condição for atendida, o círculo menor está completamente dentro do círculo maior; 
 *          caso contrário, há sobreposição ou o círculo menor não está contido.
 *          Isso é útil em várias aplicações da geometria e é amplamente utilizado para determinar relações espaciais entre objetos circulares.
 * 
 */

package _1039;

import java.util.Arrays;
import java.util.Scanner;

public class Flores_De_Fogo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String[] b = new String[6];
            String entrada = sc.nextLine();
            double distancia;
            b = entrada.split(" ");

            int R1 = Integer.parseInt(b[0]);
            int x1 = Integer.parseInt(b[1]);
            int y1 = Integer.parseInt(b[2]);

            int R2 = Integer.parseInt(b[3]);
            int x2 = Integer.parseInt(b[4]);
            int y2 = Integer.parseInt(b[5]);

            distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );

            System.out.println(Arrays.toString(b));
            System.out.println("\nR1 : " + R1
                    + "\nX1 : " + x1
                    + "\nY1 : " + y1
                    + "\n\nR2 : " + R2
                    + "\nX2 : " + x2
                    + "\nY2 : " + y2);

            System.out.println(distancia);

        }
    }
}