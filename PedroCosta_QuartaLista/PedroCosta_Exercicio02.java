/*
* Algoritmo que avalia e recebe três valores infinitamente.
* Pedro Camargo
* 29/05/2023
 */
package Lista_4;

// Scanner importado.

import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {

        Scanner leiScanner = new Scanner(System.in);

        // Iniciando as variáveis.

        int n1, n2, n3, soma = 0;

        // A estrutura repetirá enquanto a soma for diferente de 48 ou 71.

        for (int cont = 0; soma != 48 && soma != 71; cont++) {
            System.out.print("\nDigite um número: ");
            n1 = leiScanner.nextInt();
            System.out.print("Digite outro número: ");
            n2 = leiScanner.nextInt();
            System.out.print("Digite mais um número: ");
            n3 = leiScanner.nextInt();

            // Somando os três números.

            soma = n1 + n2 + n3;

            // Imprimindo o valor da soma.

            System.out.println("O resultado da soma é " + soma);

        }
      
      // Fim.

    }
}
