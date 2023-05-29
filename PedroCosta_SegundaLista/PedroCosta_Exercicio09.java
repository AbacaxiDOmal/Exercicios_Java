/* 
   Algoritmo que mostra se um dos numeros é maior ou se são iguais.
   Pedro Camargo
   17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio09 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis.

        int n1, n2;

        // Início.

        n1 = n2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();

        // Decisão encadeada:

        if(n1>n2){
            System.out.println("O primeiro é maior");
        }else if(n1<n2){
            System.out.println("O segundo é maior");
        }else{
            System.out.println("Os números são iguais");
        }

        // Fim.
    }
}
