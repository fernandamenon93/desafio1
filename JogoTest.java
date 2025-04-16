package campeonato.test;

import campeonato.domain.entity.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    @Test
    public void testResultadoVitoriaTimeA() {
        Time a = new Time("A", "SP");
        Time b = new Time("B", "RJ");

        Jogo jogo = new Jogo(a, b, 2, 1);
        jogo.registrarResultado();

        assertEquals(3, a.getPontos());
        assertEquals(0, b.getPontos());
    }

    @Test
    public void testResultadoEmpate() {
        Time a = new Time("A", "SP");
        Time b = new Time("B", "RJ");

        Jogo jogo = new Jogo(a, b, 1, 1);
        jogo.registrarResultado();

        assertEquals(1, a.getPontos());
        assertEquals(1, b.getPontos());
    }
}
