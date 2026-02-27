public class Circulo {
    private double raio;

    public Circulo(double r) {
        this.raio = r;
    }

    public double getRaio() {
        return this.raio;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaCirculo(this);
    }
}