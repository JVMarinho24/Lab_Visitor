import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorDesenharTest {

    private VisitorDesenhar visitor;

    @BeforeEach
    void setUp() {
        visitor = new VisitorDesenhar();
    }

    @Test
    void testDesenharCirculoNaoLancaExcecao() {
        Circulo c = new Circulo(3);
        assertDoesNotThrow(() -> visitor.visitaCirculo(c));
    }

    @Test
    void testDesenharTrianguloNaoLancaExcecao() {
        Triangulo t = new Triangulo(6, 4);
        assertDoesNotThrow(() -> visitor.visitaTriangulo(t));
    }

    @Test
    void testDesenharRetanguloNaoLancaExcecao() {
        Retangulo r = new Retangulo(3, 5);
        assertDoesNotThrow(() -> visitor.visitaRetangulo(r));
    }

    @Test
    void testDesenharTrapezioNaoLancaExcecao() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        assertDoesNotThrow(() -> visitor.visitaTrapezio(t));
    }

    @Test
    void testVisitorImplementaInterface() {
        assertInstanceOf(VisitorIF.class, visitor);
    }
}
