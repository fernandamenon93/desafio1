package campeonato.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras;
    private int pontos;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoras = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarJogadora(Jogadora jogadora) {
        jogadoras.add(jogadora);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Jogadora> getJogadoras() {
        return jogadoras;
    }
}

