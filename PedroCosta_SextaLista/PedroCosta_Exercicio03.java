/* 
 * Classe "Casa" que possui 5 métodos e 10 atributos.
 * Pedro Camargo.
 * 14/06/2023
 */



public class Casa {

    // atributos.
    String cor;
    String endereço;
    int numerodecomodos;
    double area;
    boolean garagem;
    boolean piscina;
    boolean quintal;
    boolean churrasqueira;
    boolean arcondicionado;
    boolean claraboia;

    // métodos.
   void ligarLuzdoQuintal(){
        if (quintal) {
            System.out.println("A luz do quintal foi acesa!");
        } else {
            System.out.println("A casa não possui quintal!");
        }
    }

    void ligarLuzdaGaragem() {
        if (garagem) {
            System.out.println("A luz garagem foi acesa.");
        } else {
            System.out.println("A casa não possui garagem.");
        }
    }

    void ligarChurrasqueira() {
        if (churrasqueira) {
            System.out.println("Tá pegando fogo bicho!!!");
        } else {
            System.out.println("A casa não possui churrasqueira.");
        }
    }

    void fecharClaraboia(){
        if (claraboia) {
            System.out.println("Está aberta.");
        } else { 
            System.out.println("A casa não possui ClaraBoia!");
        }
    }

    void ligarArCondicionado() {
        if (arcondicionado) {
            System.out.println("Ar condicionado ligado.");
        } else {
            System.out.println("A casa não possui ar condicionado.");
        }
    }

}

class CasaT {

    // chamando o método Main.

    public static void main(String[] args) {

        // instanciando o objeto casa.

        Casa ca1 = new Casa();

        // atributos.

        ca1.arcondicionado = true;
        ca1.churrasqueira = true;
        ca1.claraboia = false;
        ca1.garagem = true;
        ca1.endereço = "Pindamanhagaba";

        ca1.ligarArCondicionado();
        ca1.ligarChurrasqueira();
        ca1.fecharClaraboia();
        ca1.ligarLuzdaGaragem();

        System.out.println(ca1.endereço);


        
    }

}

// fim.
