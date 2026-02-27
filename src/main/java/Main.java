import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando as figuras geométricas (Elements)
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(6, 4);
        Retangulo retangulo = new Retangulo(4, 8);
        Trapezio trapezio = new Trapezio(10, 6, 4, 5, 5);

        // Lista de figuras
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(retangulo);
        figuras.add(trapezio);

        // Criando os Visitors
        VisitorIF visitorArea = new VisitorCalculaArea();
        VisitorIF visitorPerimetro = new VisitorCalculaPerimetro();
        VisitorIF visitorMaximizar = new VisitorMaximizarFigura();



        // Calcular Área
        System.out.println("========================================");
        System.out.println("       OPERAÇÃO: CALCULAR ÁREA          ");
        System.out.println("========================================");
        for (FiguraGeometrica figura : figuras) {
            figura.aceitaVisita(visitorArea);
        }

        // Calcular Perímetro
        System.out.println("\n========================================");
        System.out.println("     OPERAÇÃO: CALCULAR PERÍMETRO       ");
        System.out.println("========================================");
        for (FiguraGeometrica figura : figuras) {
            figura.aceitaVisita(visitorPerimetro);
        }

        // === Operação: Maximizar Figuras ===
        System.out.println("\n========================================");
        System.out.println("    OPERAÇÃO: MAXIMIZAR FIGURAS (x2)    ");
        System.out.println("========================================");
        for (FiguraGeometrica figura : figuras) {
            figura.aceitaVisita(visitorMaximizar);
        }
    }
}
