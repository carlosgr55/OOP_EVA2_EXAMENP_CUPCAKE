package Problema2;

public class Manufactura extends Empleados2 {

    private int horasSemanales;

    public Manufactura() { //Constructor sin parámetros
        super("", "", 0, 356);
        this.horasSemanales = 0;
    }

    //Constructor con parámetros
    public Manufactura(String nombre, String apellido, int edad, double salarioBase, int horasSemanales) {
        super(nombre, apellido, edad, salarioBase);
        this.horasSemanales = horasSemanales;
    }

    @Override
    public double calcularSalario() {
        //Se obtiene el salario del empleado y se multiplica por las horas semanales
        return this.getSalarioBase() * this.horasSemanales;
    }

    @Override
    public String getTipo() {
        return "Manufactura";
    }

    @Override
    public String toString() {
        return "EmpleadoManufactura{" + "horasSemanales=" + horasSemanales + "} " + super.toString();
    }
    
    
    
}
