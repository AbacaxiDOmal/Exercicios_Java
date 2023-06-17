/*
 * Objeto com 5 atributos e 5 métodos.
 * Pedro Camargo
 * 14/06/2023
 */
public class RPG {

    // atributos.

    String nome, classe;
    int int1, des, for1, sab, car, cons, nivel;
    boolean magia;

    // método construtor:

    RPG(String nome, String classe, int int1, int des, int for1, int sab, int car, int cons, int nivel) {

        this.nome = nome;
        this.classe = classe;
        this.int1 = int1;
        this.des = des;
        this.for1 = for1;
        this.sab = sab;
        this.car = car;
        this.cons = cons;
        this.nivel = nivel;

    }

    // métodos.

    public void exibirFicha() {
        System.out.println("Ficha do seu personagem: ");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Atributos: ");
        System.out.println("Força: " + int1);
        System.out.println("Destreza: " + des);
        System.out.println("Constituição: " + cons);
    }

    public int calcularClasseDeArmadura() {
        int classeDeArmadura = des + cons;
        return classeDeArmadura;
    }

    public int calcularPontosDeVida() {
        int pontosDeVida = cons + nivel / 2;
        return pontosDeVida;
    }

    public void aumentarNivel() {
        nivel++;
        System.out.println("O nível foi aumentado para " + nivel + "!");
    }

    public void temMagia() {
        magia = true;
        System.out.println("Você pode conjurar magias.");
    }

    public int calcularAtaque() {
        int ataque = for1 + des;
        return ataque;
    }

    public static void main(String[] args) {
        RPG ficha1 = new RPG("Cleitão", "Guerreiro", 2, 3, 4, 5, 6, 7, 8);

        // exibindo a ficha:
        ficha1.exibirFicha();

        // criando a classe de armadura:
        int classeDeArmadura = ficha1.calcularClasseDeArmadura();
        System.out.println("Classe de Armadura: " + classeDeArmadura);

        // criando os pontos de vida:
        int pontosDeVida = ficha1.calcularPontosDeVida();
        System.out.println("Pontos de Vida: " + pontosDeVida);

        // aumentando o nível:
        ficha1.aumentarNivel();

        // tem magia?
        ficha1.temMagia();

        // ataque:
        int ataque = ficha1.calcularAtaque();
        System.out.println("Ataque: " + ataque);
    }
}
