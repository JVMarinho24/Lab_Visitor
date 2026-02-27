public class Triangulo {

    private double Base;
    private double Altura;

    public Triangulo(double b, double h){
        this.Base = b;
        this.Altura = h;
    }

    public double getAltura() {
        return Altura;
    }

    public double getBase() {
        return Base;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaTriangulo(this);
    }
}
