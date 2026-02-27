public class Retangulo {
    private double Altura;
    private double Largura;

    public Retangulo(double h, double l){
        this.Altura = h;
        this.Largura = l;
    }

    public double getAltura() {
        return Altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaRetangulo(this);
    }
}
