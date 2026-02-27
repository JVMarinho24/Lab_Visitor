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
        // Perímetro = 2 * PI * r = 31.42
        assertDoesNotThrow(() -> visitor.visitaCirculo(c));
    }

    @Test
    void testPerimetroTriangulo() {
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);
        // Perímetro = 3 + 4 + 5 = 12
        assertDoesNotThrow(() -> visitor.visitaTriangulo(t));
    }

    @Test
    void testPerimetroRetangulo() {
        Retangulo r = new Retangulo(4, 8);
        // Perímetro = 2 * (4 + 8) = 24
        assertDoesNotThrow(() -> visitor.visitaRetangulo(r));
    }

    @Test
    void testPerimetroTrapezio() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        // Perímetro = 10 + 6 + 5 + 5 = 26
        assertDoesNotThrow(() -> visitor.visitaTrapezio(t));
    }

    @Test
    void testVisitorImplementaInterface() {
        assertInstanceOf(VisitorIF.class, visitor);
    }
}
