public class VisitorCalculaPerimetro implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        double perimetro = 2 * Math.PI * c.getRaio();
        System.out.printf("Perímetro do Círculo: %.2f%n", perimetro);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double perimetro = t.getLadoA() + t.getLadoB() + t.getLadoC();
        System.out.printf("Perímetro do Triângulo: %.2f%n", perimetro);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double perimetro = 2 * (r.getAltura() + r.getLargura());
        System.out.printf("Perímetro do Retângulo: %.2f%n", perimetro);
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        double perimetro = t.getBaseMaior() + t.getBaseMenor() + t.getLadoEsquerdo() + t.getLadoDireito();
        System.out.printf("Perímetro do Trapézio: %.2f%n", perimetro);
    }
}
