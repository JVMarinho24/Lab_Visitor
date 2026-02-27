public class VisitorCalculaArea implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        double area = Math.PI * c.getRaio() * c.getRaio();
        System.out.printf("Área do Círculo: %.2f%n", area);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double area = (t.getBase() * t.getAltura()) / 2.0;
        System.out.printf("Área do Triângulo: %.2f%n", area);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double area = r.getAltura() * r.getLargura();
        System.out.printf("Área do Retângulo: %.2f%n", area);
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        double area = ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2.0;
        System.out.printf("Área do Trapézio: %.2f%n", area);
    }
}
