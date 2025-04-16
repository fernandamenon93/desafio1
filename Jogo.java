package campeonato.domain.entity;

public class Jogo {
    private Time timeA;
    private Time timeB;
    private int golsTimeA;
    private int golsTimeB;

    public Jogo(Time timeA, Time timeB, int golsTimeA, int golsTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
    }

    public void registrarResultado() {
        if (golsTimeA > golsTimeB) {
            timeA.adicionarPontos(3);
        } else if (golsTimeB > golsTimeA) {
            timeB.adicionarPontos(3);
        } else {
            timeA.adicionarPontos(1);
            timeB.adicionarPontos(1);
        }
    }
}
