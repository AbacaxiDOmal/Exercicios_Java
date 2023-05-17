/*
 * Algoritmo que calcula a área de um triângulo.
 * Pedro Camargo.
 * 17/05/2023
 */
// Scanner importado.

import java.util.Scanner;

// Método iniciado primeiro.

public class ex3_2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Inicializando as variáveis.

        Double base, altura = 0.0;
        Double area;

        // Início.

        System.out.println("Digite dois números, um para a base e o outro para altura de seu triângulo.");

        base = leitor.nextDouble();
        altura = leitor.nextDouble();

        // Variável "area" para calcular a área do triângulo.

        area = (base * altura)/2;

        System.out.println("A área do seu triângulo é de: " + area);

        // Fim.

    }

}
        

