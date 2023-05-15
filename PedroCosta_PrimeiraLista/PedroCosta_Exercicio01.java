/* 
 * Descrição: Código que soma 3 números.
 * Autor: Pedro Camargo.
 * Data:03/05/2023
 */
//Scanner importado.

import java.util.Scanner;

//Método iniciado primeiro.

public class PedroCosta_Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis declaradas.
    
        Double n1;
        Double n2;
        Double n3;
        Double n4;
        Double res;

        // Início.

        n1 = n2 = n3 = n4 = 0.0;

        System.out.print("Insira 4 números!");

        // Leitor para ler os números inseridos pelo usuário.

        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();
        n3 = leitor.nextDouble();
        n4 = leitor.nextDouble();

        // Soma dos números.

        res = (n1 + n2 + n3 + n4);

        System.out.println("A soma do seus números!: " + res);

        // Fim.
    }
}
