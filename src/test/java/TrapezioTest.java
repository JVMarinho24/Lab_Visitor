import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrapezioTest {

    @Test
    void testCriacaoTrapezio() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        assertEquals(10, t.getBaseMaior());
        assertEquals(6, t.getBaseMenor());
        assertEquals(4, t.getAltura());
        assertEquals(5, t.getLadoEsquerdo());
        assertEquals(5, t.getLadoDireito());
    }

    @Test
    void testSetters() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        t.setBaseMaior(20);
        t.setBaseMenor(12);
        t.setAltura(8);
        t.setLadoEsquerdo(10);
        t.setLadoDireito(10);
        assertEquals(20, t.getBaseMaior());
        assertEquals(12, t.getBaseMenor());
        assertEquals(8, t.getAltura());
        assertEquals(10, t.getLadoEsquerdo());
        assertEquals(10, t.getLadoDireito());
    }

    @Test
    void testImplementaFiguraGeometrica() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        assertInstanceOf(FiguraGeometrica.class, t);
    }
}
