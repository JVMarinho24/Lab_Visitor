public class VisitorCalculaArea implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        double area = Math.PI * c.getRaio() * c.getRaio();
        System.out.printf("Área do Círculo (raio=%.2f): %.2f%n", c.getRaio(), area);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double area = (t.getBase() * t.getAltura()) / 2.0;
        System.out.printf("Área do Triângulo (base=%.2f, altura=%.2f): %.2f%n", t.getBase(), t.getAltura(), area);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double area = r.getAltura() * r.getLargura();
        System.out.printf("Área do Retângulo (altura=%.2f, largura=%.2f): %.2f%n", r.getAltura(), r.getLargura(), area);
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        double area = ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2.0;
        System.out.printf("Área do Trapézio (B=%.2f, b=%.2f, h=%.2f): %.2f%n",
                t.getBaseMaior(), t.getBaseMenor(), t.getAltura(), area);
    }
}
