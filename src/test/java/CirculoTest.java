import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    void testCriacaoCirculo() {
        Circulo c = new Circulo(5);
        assertEquals(5, c.getRaio());
    }

    @Test
    void testSetRaio() {
        Circulo c = new Circulo(3);
        c.setRaio(7);
        assertEquals(7, c.getRaio());
    }

    @Test
    void testAceitaVisita() {
        Circulo c = new Circulo(5);
        // Verifica que aceitaVisita não lança exceção
        assertDoesNotThrow(() -> c.aceitaVisita(new VisitorCalculaArea()));
    }

    @Test
    void testImplementaFiguraGeometrica() {
        Circulo c = new Circulo(1);
        assertInstanceOf(FiguraGeometrica.class, c);
    }
}
