package algoritmo;

public class Heroi {
    public int calculaSaldo(int numeroDeVitorias, int numeroDeDerrotas) {
        return numeroDeVitorias - numeroDeDerrotas;
    }

    public String obtemElo(int numeroDeVitorias) {

        if (numeroDeVitorias < 10) {
            return "Ferro";
        }

        if (numeroDeVitorias >= 11 && numeroDeVitorias <= 20) {
            return "Bronze";
        }

        if (numeroDeVitorias >= 21 && numeroDeVitorias <= 50) {
            return "Prata";
        }

        if (numeroDeVitorias >= 51 && numeroDeVitorias <= 80) {
            return "Ouro";
        }
        if (numeroDeVitorias >= 81 && numeroDeVitorias <= 90) {
            return "Diamante";
        }
        if (numeroDeVitorias >= 91 && numeroDeVitorias <= 100) {
            return "Lendário";
        }
        if (numeroDeVitorias >= 101) {
            return "Imortal";
        }

        return "Elo Não Encontrado";
    }
}