import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    void testCriacaoRetangulo() {
        Retangulo r = new Retangulo(4, 8);
        assertEquals(4, r.getAltura());
        assertEquals(8, r.getLargura());
    }

    @Test
    void testSetters() {
        Retangulo r = new Retangulo(4, 8);
        r.setAltura(10);
        r.setLargura(20);
        assertEquals(10, r.getAltura());
        assertEquals(20, r.getLargura());
    }

    @Test
    void testImplementaFiguraGeometrica() {
        Retangulo r = new Retangulo(1, 1);
        assertInstanceOf(FiguraGeometrica.class, r);
    }
}
