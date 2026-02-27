public class VisitorCalculaArea implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {
        return 2345678;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return 1;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return (3.14*(c.getRaio()*c.getRaio()));
    }
}
