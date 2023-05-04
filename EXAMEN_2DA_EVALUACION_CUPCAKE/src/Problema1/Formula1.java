package Problema1;

public class Formula1 extends Movimiento {

    //Constructor default
    public Formula1() {
        super();
    }

    //Constructor con argumentos
    public Formula1(double v0, double t, double a) {
        super(v0, 0, a, t);
    }

    //PRIMERA FORMULA 
    @Override
    public double calcularDistancia() {
        //Primero se obtienen los valores de la velocidad inicial y del tiempo. Se multiplican
        //Después, se multiplica la aceleración por el cuadrado del tiempo, y se divide entre dos
        //Estos dos valores se suman y se regresan
        return (getV0() * getT()) + ((getA() * Math.pow(getT(), 2)) / 2);
    }
}
