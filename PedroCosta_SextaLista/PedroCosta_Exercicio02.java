/*
 * Objeto "Cinto".
 * Pedro Camargo.
 * 14/06/2023
 */

public class Cinto {

    // atributos.
    String cor;
    int tamanho;
    boolean afivelado;

    // métodos.

    Cinto() {

    }

    void afivelar(boolean afivelado) {
        this.afivelado = afivelado;
        if (afivelado == true) {
            System.out.println("Seu cinto foi afivelado.");
        } else {
            System.out.println("Não foi afivelado");
        }
    }

    int ajustarTamanho(int novoTamanho) {
        this.tamanho += novoTamanho;
        return novoTamanho;
    }

    void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

}

class CintoT {

    // chamando o método Main.

    public static void main(String[] args) {

        // instanciando o objeto "cinto".

        Cinto c1 = new Cinto();

        // atributos.

        c1.cor = "Marrom";
        c1.tamanho = 20;
        c1.afivelado = true;

        // métodos.

        System.out.println("Informações do seu iCinto digital: ");

        c1.trocarCor("Preto");

        System.out.println(c1.cor);

        c1.afivelar(true);

        System.out.println();

        c1.ajustarTamanho(10);{

            c1.tamanho = c1.ajustarTamanho(10) + c1.tamanho;
            System.out.println(c1.tamanho);

        }
           

    }
}

// fim.
