/*
 * Descrição: Calcula o perímetro do raio inserido pelo usuário.
 * Autor: Pedro Camargo.
 * Data:15/05/2023
 */
// Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class PedroCosta_Exercicio06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        Double raio, result = 0.0;

        // Lê o valor inserido pelo usuário através do leitor.

        System.out.println("Insira um valor para ser o raio de sua circunferência: ");

       raio = leitor.nextDouble();

       // Calcula o perímetro do raio inserido e o mostra para o usuário.

       result = (6.28 * raio);
        
        // Mostra ao usuário o resultado.

       System.out.println ("Este é o perímetro do seu raio!\n" + result);

       // Fim.
    }
}
