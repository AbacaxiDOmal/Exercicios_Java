/* 
   Algoritmo que lê dois valores mostra todos os números entre eles.
   Pedro Camargo
   18/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio02 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis.

        int n1 = 0, n2 = 0;

        // Lendo os dois valores:

        System.out.print("Digite um número: ");
        n1 = input.nextInt();

        System.out.print("\nDigite outro número maior: ");
        n2 = input.nextInt();

        for(int cont = n1; cont < n2; cont++){// Iniciando o laço for
            System.out.println(cont);// Mostrando os valores.
        }

        // Fim.
    }
}
