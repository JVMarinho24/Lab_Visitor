public class Trapezio implements FiguraGeometrica {
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double ladoEsquerdo;
    private double ladoDireito;

    public Trapezio(double baseMaior, double baseMenor, double altura, double ladoEsquerdo, double ladoDireito) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoEsquerdo = ladoEsquerdo;
        this.ladoDireito = ladoDireito;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(double ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public double getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(double ladoDireito) {
        this.ladoDireito = ladoDireito;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        v.visitaTrapezio(this);
    }
}
