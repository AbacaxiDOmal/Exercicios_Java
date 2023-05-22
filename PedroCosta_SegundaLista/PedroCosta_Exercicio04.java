/*
 * Algoritmo que inverte as variáveis.
 * Pedro Camargo.
 * 17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        int var_1, var_2, var_3 = 0;

        System.out.println("Digite um número para ser testado");

        var_1 = leitor.nextInt();

        System.out.println("Digite outro número para ser testado");

        var_2 = leitor.nextInt();
      
      //Invertendo o valor das variáveis.

        var_3 = var_1;

        var_1 = var_2;

        var_2 = var_3;

        System.out.println("Seus valores foram invertidos\n" + var_1 + " " + var_2);
        
        // Fim.

    }

}
