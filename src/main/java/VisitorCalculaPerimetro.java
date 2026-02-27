public class VisitorCalculaPerimetro implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        double perimetro = 2 * Math.PI * c.getRaio();
        System.out.printf("Perímetro do Círculo (raio=%.2f): %.2f%n", c.getRaio(), perimetro);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double perimetro = t.getLadoA() + t.getLadoB() + t.getLadoC();
        System.out.printf("Perímetro do Triângulo (lados=%.2f, %.2f, %.2f): %.2f%n",
                t.getLadoA(), t.getLadoB(), t.getLadoC(), perimetro);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double perimetro = 2 * (r.getAltura() + r.getLargura());
        System.out.printf("Perímetro do Retângulo (altura=%.2f, largura=%.2f): %.2f%n",
                r.getAltura(), r.getLargura(), perimetro);
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        double perimetro = t.getBaseMaior() + t.getBaseMenor() + t.getLadoEsquerdo() + t.getLadoDireito();
        System.out.printf("Perímetro do Trapézio (B=%.2f, b=%.2f, le=%.2f, ld=%.2f): %.2f%n",
                t.getBaseMaior(), t.getBaseMenor(), t.getLadoEsquerdo(), t.getLadoDireito(), perimetro);
    }
}
