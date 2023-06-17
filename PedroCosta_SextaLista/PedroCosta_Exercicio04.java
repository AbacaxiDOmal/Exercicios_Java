/* 
 * Classe "vovoh" que possui um método construtor.
 * Pedro Camargo.
 * 14/06/2023
 */

public class Vovoh {

    // atributos.
    String raça, classe;
    int pontosDEvida;
    int lvl;

    // métodos.
    Vovoh(String raça, String classe, int pontosDEvida, int lvl) {
        this.raça = raça;
        this.classe = classe;
        this.pontosDEvida = pontosDEvida;
        this.lvl = lvl;

    }

}

class VovohT {

    public static void main(String[] args) {

        Vovoh v1 = new Vovoh(null, null, 0, 0);

        v1.raça = "Branca";
        v1.classe = "Cozinheira.";
        v1.pontosDEvida = 10;
        v1.lvl = 10;

        Vovoh v2 = new Vovoh("Parda", "Costureira", 15, 23);

        System.out.println("Rinha de Vovohs: ");

        System.out.println(" Primeira Vovoh, informações: Raça: " + v1.raça + " Classe: " + v1.classe + " Pontos de vida: " + v1.pontosDEvida + " Level: " + v1.lvl);

        System.out.println(" Primeira Vovoh, informações: Raça: " + v2.raça + " Classe: " + v2.classe + " Pontos de vida: " + v2.pontosDEvida + " Level: " + v2.lvl);

        


    }

}

// fim.
