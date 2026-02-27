import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorMaximizarFiguraTest {

    private VisitorMaximizarFigura visitor;

    @BeforeEach
    void setUp() {
        visitor = new VisitorMaximizarFigura();
    }

    @Test
    void testMaximizarCirculoDuplicaRaio() {
        Circulo c = new Circulo(5);
        visitor.visitaCirculo(c);
        assertEquals(10, c.getRaio());
    }

    @Test
    void testMaximizarTrianguloDuplicaDimensoes() {
        Triangulo t = new Triangulo(6, 4, 6, 5, 5);
        visitor.visitaTriangulo(t);
        assertEquals(12, t.getBase());
        assertEquals(8, t.getAltura());
        assertEquals(12, t.getLadoA());
        assertEquals(10, t.getLadoB());
        assertEquals(10, t.getLadoC());
    }

    @Test
    void testMaximizarRetanguloDuplicaDimensoes() {
        Retangulo r = new Retangulo(4, 8);
        visitor.visitaRetangulo(r);
        assertEquals(8, r.getAltura());
        assertEquals(16, r.getLargura());
    }

    @Test
    void testMaximizarTrapezioDuplicaDimensoes() {
        Trapezio t = new Trapezio(10, 6, 4, 5, 5);
        visitor.visitaTrapezio(t);
        assertEquals(20, t.getBaseMaior());
        assertEquals(12, t.getBaseMenor());
        assertEquals(8, t.getAltura());
        assertEquals(10, t.getLadoEsquerdo());
        assertEquals(10, t.getLadoDireito());
    }

    @Test
    void testMaximizarDuplicaArea() {
        Circulo c = new Circulo(5);
        double areaAntes = Math.PI * c.getRaio() * c.getRaio();
        visitor.visitaCirculo(c);
        double areaDepois = Math.PI * c.getRaio() * c.getRaio();
        // Área deve quadruplicar (2² = 4) quando raio duplica
        assertEquals(areaAntes * 4, areaDepois, 0.001);
    }

    @Test
    void testVisitorImplementaInterface() {
        assertInstanceOf(VisitorIF.class, visitor);
    }
}
