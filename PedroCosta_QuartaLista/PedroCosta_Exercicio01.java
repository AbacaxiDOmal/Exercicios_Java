/* 
   Algoritmo que soma todos os números cujo quadrado (x²) for divisível por 4.
   Pedro Camargo
   29/05/2023
 */
package Lista_4;

// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio01 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        // Inicialização das variáveis.

        System.out.print("Digite o limite superior: ");
        
        int limiteSuperior = leitor.nextInt();

        int soma = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            int quadrado = i * i;
            if (quadrado % 4 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números cujo quadrado é divisível por 4 é: " + soma);
    }
}
