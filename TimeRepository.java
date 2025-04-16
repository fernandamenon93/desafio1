package campeonato.domain.repository;

import campeonato.domain.entity.Time;
import java.util.List;

public interface TimeRepository {
    void salvar(Time time);
    List<Time> listarTodos();
    Time buscarPorNome(String nome);
}
