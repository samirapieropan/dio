package orientacaoobjeto;

public class HeroiMain {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.nome = "Sage";
        heroi.tipo = "Guerreiro";

        heroi.atacar();
    }
}