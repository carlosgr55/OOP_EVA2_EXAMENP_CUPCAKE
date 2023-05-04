package Problema1;

// Clase para la fórmula 2
public class Formula2 extends Movimiento {

    //Constructor con argumentos
    public Formula2(Double v0, Double vf, Double a, Double t) {
        super(v0, vf, a, t);
    }
    
    //Constructor default
    public Formula2(){
        super();
    }

    @Override
    public double calcularDistancia() {
        //Para la segunda formula, la suma de la velocidad inicial con la final se 
        //Divide entre dos, y a este resultado se multiplica por el tiempo
        return ((super.getV0() + super.getVf()) / 2) * super.getT();
    }
}
