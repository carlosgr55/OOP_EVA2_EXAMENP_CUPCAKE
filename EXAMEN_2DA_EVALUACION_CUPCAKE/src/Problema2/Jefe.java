package Problema2;

public class Jefe extends Empleados2 {

    public Jefe() {//Constructor default
        super("", "", 0, 2000);
    }

    public Jefe(String nombre, String apellido, int edad, double salarioBase) {
        //Constructor con argumentos
        super(nombre, apellido, edad, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase();
    }
}
