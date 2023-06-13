/*
 * Classe "Cinto" que possui 5 métodos.
 * Pedro Camargo.
 * 10/06/2023
 */

 public class Cinto {

    // atributos.
    String cor;
    int tamanho;
    boolean afivelado;

    // métodos.
    void afivelar(boolean afivelado) {
        this.afivelado = afivelado;
    }

    void naoafivelado(boolean naoafivelado) {
        afivelado = !naoafivelado;
    }

    void ajustarTamanho(int novoTamanho) {
        this.tamanho += novoTamanho;
    }

    void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

}

// fim.
