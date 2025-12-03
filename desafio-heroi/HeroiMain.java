package algoritmo;

public class HeroiMain {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        int saldo = heroi.calculaSaldo(50, 10);
        String elo = heroi.obtemElo(20);
        System.out.println("O Herói tem saldo de " + saldo + " e está no nível de " + elo);
    }
}
