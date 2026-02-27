public class VisitorDesenhar implements VisitorIF {

    @Override
    public void visitaCirculo(Circulo c) {
        int raio = (int) Math.round(c.getRaio());
        System.out.println("Desenhando Círculo (raio=" + String.format("%.2f", c.getRaio()) + "):");
        for (int y = -raio; y <= raio; y++) {
            StringBuilder linha = new StringBuilder();
            for (int x = -raio; x <= raio; x++) {
                if (x * x + y * y <= raio * raio) {
                    linha.append("* ");
                } else {
                    linha.append("  ");
                }
            }
            System.out.println(linha.toString());
        }
        System.out.println();
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        int altura = (int) Math.round(t.getAltura());
        System.out.println("Desenhando Triângulo (base=" + String.format("%.2f", t.getBase())
                + ", altura=" + String.format("%.2f", t.getAltura()) + "):");
        for (int i = 1; i <= altura; i++) {
            StringBuilder linha = new StringBuilder();
            // Espaços à esquerda
            for (int j = 0; j < altura - i; j++) {
                linha.append(" ");
            }
            // Estrelas
            for (int j = 0; j < 2 * i - 1; j++) {
                linha.append("*");
            }
            System.out.println(linha.toString());
        }
        System.out.println();
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        int altura = (int) Math.round(r.getAltura());
        int largura = (int) Math.round(r.getLargura());
        System.out.println("Desenhando Retângulo (altura=" + String.format("%.2f", r.getAltura())
                + ", largura=" + String.format("%.2f", r.getLargura()) + "):");
        for (int i = 0; i < altura; i++) {
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < largura; j++) {
                linha.append("* ");
            }
            System.out.println(linha.toString());
        }
        System.out.println();
    }

    @Override
    public void visitaTrapezio(Trapezio t) {
        int baseMaior = (int) Math.round(t.getBaseMaior());
        int baseMenor = (int) Math.round(t.getBaseMenor());
        int altura = (int) Math.round(t.getAltura());
        System.out.println("Desenhando Trapézio (B=" + String.format("%.2f", t.getBaseMaior())
                + ", b=" + String.format("%.2f", t.getBaseMenor())
                + ", h=" + String.format("%.2f", t.getAltura()) + "):");

        for (int i = 0; i < altura; i++) {
            // Interpola entre baseMenor (topo) e baseMaior (base)
            int larguraAtual = baseMenor + (int) Math.round((double)(baseMaior - baseMenor) * i / (altura - 1));
            int espacos = (baseMaior - larguraAtual) / 2;
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < espacos; j++) {
                linha.append(" ");
            }
            for (int j = 0; j < larguraAtual; j++) {
                linha.append("*");
            }
            System.out.println(linha.toString());
        }
        System.out.println();
    }
}
