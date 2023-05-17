/*
 * Descrição: O algoritmo lerá um valor em REAL e descontará 15%.
 * Autor: Pedro Camargo.
 * Data:17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class PedroCosta_Exercicio01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        Double valor_r; 
        Double valor_desc;

        // Início.

        valor_r = 0.0;

        System.out.println("Digite um valor em R$ para ser descontado 15% do total: ");

        // Leitor para guardar o valor sugerido pelo usuário.

        valor_r = leitor.nextDouble();

        valor_desc = (0.15 * valor_r);

        System.out.println(valor_r + " 15% de desconto: " + valor_desc);
        
        // Fim.
        
    }
    
}
