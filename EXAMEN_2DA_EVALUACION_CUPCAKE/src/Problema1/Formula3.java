package Problema1;

// Clase para la fórmula 3
public class Formula3 extends Movimiento {

    //Constructor con argumentos
    public Formula3(Double v0, Double vf, Double a, Double t) {
        super(v0, vf, a, t);
    }

    //Constructor default
    public Formula3(){
        super();
    }
    @Override
    public double calcularDistancia() {
        //Primero se resta la velocidad final menos la velocidad inicial
        //Y se divide entre el doble de la aceleración
        return ((super.getVf() - super.getV0())) / (2 * super.getA());
    }
}
