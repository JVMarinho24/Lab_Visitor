import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    void testCriacaoComBaseEAltura() {
        Triangulo t = new Triangulo(6, 4);
        assertEquals(6, t.getBase());
        assertEquals(4, t.getAltura());
    }

    @Test
    void testConstrutorSimplificadoCalculaLados() {
        Triangulo t = new Triangulo(6, 4);
        // ladoA = base
        assertEquals(6, t.getLadoA());
        // ladoB e ladoC = hipotenusa do triângulo isósceles
        double meiaBase = 6.0 / 2.0;
        double ladoEsperado = Math.sqrt(meiaBase * meiaBase + 4.0 * 4.0);
        assertEquals(ladoEsperado, t.getLadoB(), 0.001);
        assertEquals(ladoEsperado, t.getLadoC(), 0.001);
    }

    @Test
    void testCriacaoComTodosOsLados() {
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);
        assertEquals(3, t.getBase());
        assertEquals(4, t.getAltura());
        assertEquals(3, t.getLadoA());
        assertEquals(4, t.getLadoB());
        assertEquals(5, t.getLadoC());
    }

    @Test
    void testSetters() {
        Triangulo t = new Triangulo(6, 4);
        t.setBase(10);
        t.setAltura(8);
        t.setLadoA(10);
        t.setLadoB(12);
        t.setLadoC(12);
        assertEquals(10, t.getBase());
        assertEquals(8, t.getAltura());
        assertEquals(10, t.getLadoA());
        assertEquals(12, t.getLadoB());
        assertEquals(12, t.getLadoC());
    }

    @Test
    void testImplementaFiguraGeometrica() {
        Triangulo t = new Triangulo(3, 4);
        assertInstanceOf(FiguraGeometrica.class, t);
    }
}
