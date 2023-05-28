/* 
  * Algoritmo que recebe um numero e mostra ele e seu antecessor e sucessor. 
  * 11/05/2023 
  * Pedro Camargo
*/
  
  //Scanner importado.
 import java.util.Scanner; 
 public class PedroCosta_Exercicio05 { 
     public static void main(String[] args){ 

         //Variaveis.

         int n1; 
  
         //Inicio.

         n1 = 0; 
  
         //Criando um scanner para ler a variável. 
 
         Scanner leitor = new Scanner(System.in); 
  
         //Irá ler a variável N1.

         System.out.println("Digite um número"); 

         n1 = leitor.nextInt(); 
  
         //Mostra o resultado dos calculos ao usuário.
         System.out.println("Antecessor: "+(n1 - 1)+" Número: "+n1+" Sucessor: "+(n1 + 1));
       
       //Fim.
     } 
 }
