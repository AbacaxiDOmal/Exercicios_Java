/* 
   Algoritmo que faz uma ficha com dados do usuário.
   Pedro Camargo
   17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

public class PedroCosta_Exercicio08 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis.

        int idade;

        double altura;

        String nome;

        char genero;
        
        // Pedindo os dados ao usuário.

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();
        
        System.out.print("Digite seu gênero (M/F): ");
        genero = scanner.next().charAt(0);
        
        // Decisão encadeada:

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
            
            if (genero == 'M') {
                System.out.println("Olá, Sr. " + nome);
            } else {
                System.out.println("Olá, Sra. " + nome);
            }
            
            System.out.println("Altura: " + altura);
        } else {
            System.out.println("Você é menor de idade.");
        }
        
       // Fim.

    }
}
