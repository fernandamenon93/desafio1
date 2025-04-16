package campeonato.application;

import campeonato.domain.entity.Time;
import campeonato.domain.repository.TimeRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTimeRepository implements TimeRepository {
    private List<Time> times = new ArrayList<>();

    @Override
    public void salvar(Time time) {
        times.add(time);
    }

    @Override
    public List<Time> listarTodos() {
        return times;
    }

    @Override
    public Time buscarPorNome(String nome) {
        return times.stream()
                .filter(t -> t.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
