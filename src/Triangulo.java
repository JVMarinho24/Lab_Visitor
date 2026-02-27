public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Construtor para triângulo genérico (com 3 lados e altura)
    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Construtor simplificado (base e altura, assume lados iguais à base)
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        // Calcula hipotenusa para triângulo isósceles
        double meiaBase = base / 2.0;
        double lado = Math.sqrt(meiaBase * meiaBase + altura * altura);
        this.ladoA = base;
        this.ladoB = lado;
        this.ladoC = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        v.visitaTriangulo(this);
    }
}
