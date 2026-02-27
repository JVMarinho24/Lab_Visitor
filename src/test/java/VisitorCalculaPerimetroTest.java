import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorCalculaPerimetroTest {

    private VisitorCalculaPerimetro visitor;

    @BeforeEach
    void setUp() {
        visitor = new VisitorCalculaPerimetro();
    }

    @Test
    void testPerimetroCirculo() {
        Circulo c = new Circulo(5);
        assertDoesNotThrow(() -> visitor.visitaCirculo(c));
    }

    @Test
    void testPerimetroTriangulo() {
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);
        assertDoesNotThrow(() -> visitor.visitaTriangulo(t));
    }

    @Test
    void testPerimetroRetangulo() {
        Retangulo r = new Retangulo(4, 8);
        assertDoesNotThrow(() -> visitor.visitaRetangulo(r));
    }

    @Test
    void testPerimetroTrapezio() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        assertDoesNotThrow(() -> visitor.visitaTrapezio(t));
    }

    @Test
    void testVisitorImplementaInterface() {
        assertInstanceOf(VisitorIF.class, visitor);
    }
}
