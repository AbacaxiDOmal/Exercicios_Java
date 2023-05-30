/* 
   Algoritmo que mostra apenas os números ímpares de 0 a 1000!
   Pedro Camargo
   29/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Inicialização das variáveis.

        int numero = 1;

        // Iniciando o laço "DO WHILE".

        do{
            System.out.println(numero);
            numero += 2;
        } while (numero <= 1000);


         // Fim.
    }
}
