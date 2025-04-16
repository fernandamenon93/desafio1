package campeonato.main;

import campeonato.domain.entity.*;
import campeonato.application.InMemoryTimeRepository;
import campeonato.domain.repository.TimeRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TimeRepository repositorio = new InMemoryTimeRepository();

        Time t1 = new Time("Estrelas FC", "São Paulo");
        t1.adicionarJogadora(new Jogadora("Ana", 20, "Meia", 10));

        Time t2 = new Time("Furiosas", "Campinas");
        t2.adicionarJogadora(new Jogadora("Bruna", 22, "Zagueira", 5));

        repositorio.salvar(t1);
        repositorio.salvar(t2);

        // Registrar Jogo
        Jogo jogo = new Jogo(t1, t2, 1, 1); // Empate
        jogo.registrarResultado();

        // Classificação
        List<Time> classificacao = repositorio.listarTodos();
        classificacao.sort(Comparator.comparingInt(Time::getPontos).reversed());

        System.out.println("=== Classificação ===");
        for (Time time : classificacao) {
            System.out.println(time.getNome() + " - " + time.getPontos() + " pts");
        }
    }
}
