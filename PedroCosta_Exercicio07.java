/* 
   Algoritmo que avalia os números.
   Pedro Camargo.
   17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio07 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        // Inicializando as variáveis.

        int n1 = 0;
       
        System.out.print("Digite um número: ");

        n1 = leia.nextInt();

        // Verificando o número digitado pelo usuário.

        if(n1 > 94 && n1 < 456)
            System.out.print("Acertou"); // Mostra se acertou.
        else
            System.out.print("Tente de novo"); // Mostra se errou.

            //Fim.
    }
}
