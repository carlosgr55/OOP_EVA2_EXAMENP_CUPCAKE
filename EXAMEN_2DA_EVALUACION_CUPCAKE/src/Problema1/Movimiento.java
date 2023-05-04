package Problema1;

public abstract class Movimiento implements Captura {

    private double v0; //Velocidad inicial 
    private double vf; //Velocidad incial
    private double a; //Aceleración
    private double t; //Tiempo

    //Constructor default
    public Movimiento() {
        this.v0 = 0;
        this.vf = 0;
        this.a = 1;
        this.t = 1;
    }

    //Constructor con parámetros implementados de la interfaz
    public Movimiento(double v0, double vf, double a, double t) {
        this.v0 = v0;
        this.vf = vf;
        this.a = a;
        this.t = t;
    }

    //Métodos get y set
    @Override
    public void setV0(double v0) {
        this.v0 = v0;
    }

    @Override
    public double getV0() {
        return v0;
    }

    @Override
    public void setVf(double vf) {
        this.vf = vf;
    }

    @Override
    public double getVf() {
        return vf;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double getT() {
        return t;
    }

    //Método abstracto para calcular distancia
    public abstract double calcularDistancia();
}
