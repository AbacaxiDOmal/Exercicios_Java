/*
 * Algoritmo que recebe 3 números e aponta qual é maior.
 * Pedro Camargo.
 * 17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class PedroCosta_Exercicio02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        Double n1, n2, n3 = 0.0;

        // Início.

        System.out.println("Insira três dígitos!");

        // Scanner importado para ler os dígitos do usuário.
        
        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();
        n3 = leitor.nextDouble();

        // Estrutura de decisão para avaliar os dígitos.

          if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " É o maior.");
        } else if (n2 > n3){
            System.out.println(n2 + " É o maior.");
        } else {
          System.out.println(n3 + " É o maior.");
            
        }

        // Fim.
        
    }
    
}
