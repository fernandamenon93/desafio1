package campeonato.test;

import campeonato.domain.entity.Time;
import campeonato.domain.entity.Jogadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testAdicionarJogadora() {
        Time time = new Time("Exemplo", "Cidade");
        Jogadora jogadora = new Jogadora("Maria", 21, "Atacante", 9);

        time.adicionarJogadora(jogadora);

        assertEquals(1, time.getJogadoras().size());
        assertEquals("Maria", time.getJogadoras().get(0).getNome());
    }

    @Test
    public void testAdicionarPontos() {
        Time time = new Time("Time XPTO", "Cidade");
        time.adicionarPontos(3);
        assertEquals(3, time.getPontos());
    }
}
