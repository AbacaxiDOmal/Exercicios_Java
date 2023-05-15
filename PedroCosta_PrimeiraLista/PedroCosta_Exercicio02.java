/* 
 * Descrição: Código que soma o quadrado dos números inseridos pelo usuário.
 * Autor: Pedro Camargo.
 * Data:03/05/2023
 */
//Scanner importado.

import java.util.Scanner;

//Método iniciado primeiro.

public class PedroCosta_Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis declaradas.

        int n1;
        int n2;
        int n3;
        int n4;
        double res;

        // Início.

        n1 = n2 = n3 = n4 = 0;

        System.out.println("Insira 4 números!");

        // Leitor para ler os números inseridos pelo usuário.

        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt(); 
        n4 = leitor.nextInt();

        // Mostra os calculos ao usuário.

        res = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2);

        System.out.print("A soma dos quadrados dos seus números é: " + res);

        // Fim.

    }
}
