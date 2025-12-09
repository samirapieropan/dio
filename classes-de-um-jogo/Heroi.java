package orientacaoobjeto;

public class Heroi {
    String nome;
    int idae;
    String tipo;

    public void atacar() {

        String ataque = "";
        if (tipo.equalsIgnoreCase("Mago")) {
            ataque = "magia";
        }
        if (tipo.equalsIgnoreCase("Guerreiro")) {
            ataque = "espada";
        }
        if (tipo.equalsIgnoreCase("Monge")) {
            ataque = "artes maciais";
        }
        if (tipo.equalsIgnoreCase("Ninja")) {
            ataque = "shuriken";
        }
        System.out.printf("O %s %s atacou usando %s", tipo, nome, ataque);
    }
}