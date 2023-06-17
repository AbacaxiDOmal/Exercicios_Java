/* 
 * Classe Alimento com 10 atributos! E o objeto criado a partir dela.
 * Pedro Camargo.
 * 14/06/2023
 */

public class Alimento {

   // atributos atribuídos a Classe "Alimento".

   String nome;
   String tipo;
   String marca;
   String origem;
   Double valor;
   int saude;
   boolean vegano;
   boolean transgenico;
   boolean saudavel;

}

class AlimentoT {

   // chamando o método Main.

   public static void main(String[] args) {
      
      // Instanciando o objeto "Alimento".

      Alimento a1 = new Alimento();

      // atributos.

      a1.nome = "Chocolate.";
      a1.tipo = "Barra ao leite.";
      a1.marca = "Ferreiro.";
      a1.origem = "Cacau.";
      a1.valor = 10.00;
      a1.saude = 2;
      a1.vegano = false;
      a1.transgenico = true;
      a1.saudavel = true;

      System.out.println(a1.nome);
      System.out.println(a1.tipo);
      System.out.println(a1.marca);
      System.out.println(a1.origem);
      System.out.println("R$ " + a1.valor);
      System.out.println(a1.saude);
      System.out.println(a1.vegano);
      System.out.println(a1.transgenico);
      System.out.println(a1.saudavel);
      
   }

}

// fim.
