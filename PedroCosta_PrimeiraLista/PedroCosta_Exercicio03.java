/* 
 * Descrição: Código que converte REAL na atual cotação do DÓLAR.
 * Autor: Pedro Camargo.
 * Data:15/05/2023
 */
//Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class PedroCosta_Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        Double var_dolar;
        Double var_real;

        // Início.

        var_dolar = 4.89;
        var_real = 0.0;

        System.out.println("Insira o valor em REAL para conversão em DÓLAR!");

        // Leitor para o número inserido.

        var_real = leitor.nextDouble();

        // Mostra o resultado.

        System.out.println("Este é o valor: " + (var_real/var_dolar));

        // Fim.
    }
}
