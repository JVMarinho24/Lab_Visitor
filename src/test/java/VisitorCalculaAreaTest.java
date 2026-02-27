import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorCalculaAreaTest {

    private VisitorCalculaArea visitor;

    @BeforeEach
    void setUp() {
        visitor = new VisitorCalculaArea();
    }

    @Test
    void testAreaCirculo() {
        Circulo c = new Circulo(5);
        double areaEsperada = Math.PI * 25;
        // O visitor imprime, verificamos que não lança exceção
        assertDoesNotThrow(() -> visitor.visitaCirculo(c));
    }

    @Test
    void testAreaTriangulo() {
        Triangulo t = new Triangulo(6, 4);
        assertDoesNotThrow(() -> visitor.visitaTriangulo(t));
    }

    @Test
    void testAreaRetangulo() {
        Retangulo r = new Retangulo(4, 8);
        assertDoesNotThrow(() -> visitor.visitaRetangulo(r));
    }

    @Test
    void testAreaTrapezio() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        assertDoesNotThrow(() -> visitor.visitaTrapezio(t));
    }

    @Test
    void testVisitorImplementaInterface() {
        assertInstanceOf(VisitorIF.class, visitor);
    }
}
