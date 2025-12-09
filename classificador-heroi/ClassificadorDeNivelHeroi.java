package algoritmo;

import java.util.Scanner;

public class ClassificadorDeNivelHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do herói:");
        String nome = scanner.next();
        System.out.println("Digite a quantidade de XP do herói:");
        int quantidadeDeXP = scanner.nextInt();
        String nivel;

        if (quantidadeDeXP <= 1000) {
            nivel = "Nível Ferro";
        } else if (quantidadeDeXP <= 2000) {
            nivel = "Nível Bronze";
        } else if (quantidadeDeXP <= 5000) {
            nivel = "Nível Prata";
        } else if (quantidadeDeXP <= 7000) {
            nivel = "Nível Ouro";
        } else if (quantidadeDeXP <= 8000) {
            nivel = "Nível Platina";
        } else if (quantidadeDeXP <= 9000) {
            nivel = "Nível Ascendente";
        } else if (quantidadeDeXP <= 10000) {
            nivel = "Nível Imortal";
        } else {
            nivel = "Nível Radiante";
        }
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
    }
}





