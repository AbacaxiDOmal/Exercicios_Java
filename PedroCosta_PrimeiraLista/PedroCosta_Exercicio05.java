/* 
 * Descrição: Classifica uma pessoa pela idade.
 * Autor: Pedro Camargo.
 * Data:15/05/2023
 */
//Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class PedroCosta_Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        int idade;

        // Início.

        System.out.println("Insira sua idade: ");

        // Leitor para ler a "idade" do usuário.

        idade = leitor.nextInt();
        if (idade >= 66) {
            System.out.println("Você é idoso!");
        } else if (idade > 19) {
            System.out.println("Você é um adulto!");
        } else if (idade > 12) {
            System.out.println("Você é adolescente");
        } else {
            System.out.println("Você certamente é criança!");
        }

        // Fim.
    }
}
