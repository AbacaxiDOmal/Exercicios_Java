/* 
   Algoritmo que auxília na venda de sorvetes.
   Pedro Camargo
   17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class ex6_2 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        //Inicializando variáveis para cada sorvete.

        Double n_kiwi, n_laranja, n_roma = 0.0;
       
        // Lendo a quantidade de cada sabor de sorvete que o cliente comprou:

        System.out.print("Digite quantos picolés de Kiwi você comprou: ");

        n_kiwi = leia.nextDouble();

        System.out.print("Digite quantos picolés de Laranja você comprou: ");

        n_laranja = leia.nextDouble();

        System.out.print("Digite quantos picolés de Romã você comprou: ");

        n_roma = leia.nextDouble();
       
        // Imprime e mostra o valor da compra:

        System.out.print("Valor total da compra: "+((n_kiwi * 3.2) + (n_laranja * 2.39) + (n_roma * 7.99)));

        // Fim.
    }
}
