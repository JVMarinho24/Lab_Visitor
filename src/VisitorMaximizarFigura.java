public class VisitorMaximizarFigura implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        double raioAntigo = c.getRaio();
        c.setRaio(c.getRaio() * 2);
        System.out.printf("Círculo maximizado: raio %.2f -> %.2f%n", raioAntigo, c.getRaio());
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double baseAntiga = t.getBase();
        double alturaAntiga = t.getAltura();
        t.setBase(t.getBase() * 2);
        t.setAltura(t.getAltura() * 2);
        t.setLadoA(t.getLadoA() * 2);
        t.setLadoB(t.getLadoB() * 2);
        t.setLadoC(t.getLadoC() * 2);
        System.out.printf("Triângulo maximizado: base %.2f -> %.2f, altura %.2f -> %.2f%n",
                baseAntiga, t.getBase(), alturaAntiga, t.getAltura());
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double alturaAntiga = r.getAltura();
        double larguraAntiga = r.getLargura();
        r.setAltura(r.getAltura() * 2);
        r.setLargura(r.getLargura() * 2);
        System.out.printf("Retângulo maximizado: altura %.2f -> %.2f, largura %.2f -> %.2f%n",
                alturaAntiga, r.getAltura(), larguraAntiga, r.getLargura());
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        double bMaiorAntiga = t.getBaseMaior();
        double bMenorAntiga = t.getBaseMenor();
        double alturaAntiga = t.getAltura();
        t.setBaseMaior(t.getBaseMaior() * 2);
        t.setBaseMenor(t.getBaseMenor() * 2);
        t.setAltura(t.getAltura() * 2);
        t.setLadoEsquerdo(t.getLadoEsquerdo() * 2);
        t.setLadoDireito(t.getLadoDireito() * 2);
        System.out.printf("Trapézio maximizado: B %.2f -> %.2f, b %.2f -> %.2f, h %.2f -> %.2f%n",
                bMaiorAntiga, t.getBaseMaior(), bMenorAntiga, t.getBaseMenor(), alturaAntiga, t.getAltura());
    }
}
