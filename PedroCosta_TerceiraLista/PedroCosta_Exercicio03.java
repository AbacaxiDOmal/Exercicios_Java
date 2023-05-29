/* 
   Algoritmo que calcula a média de 500 valores inseridos.
   Pedro Camargo
   29/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class ex3_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Inicialização das variáveis.

        Double soma, nota = 0.0;
        soma = 0.0;
        int contador = 1;

        // Estrutura de repetição.

        while(contador <= 500){
            
            System.out.println("Digite uma nota: ");
            nota = input.nextDouble();
            soma += nota;
            
            contador++;
        }
        System.out.println("A média das notas é de " + ( soma / 500));

        // Fim.

    }

}
