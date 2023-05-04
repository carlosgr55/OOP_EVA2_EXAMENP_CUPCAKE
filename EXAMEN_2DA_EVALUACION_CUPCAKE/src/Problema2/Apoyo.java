package Problema2;

public class Apoyo extends Empleados2 {

    private int horasSemanales;

    public Apoyo() {
        //Constructor defautl
        super("", "", 0, 203);
        this.horasSemanales = 0;
    }

    public Apoyo(String nombre, String apellido, int edad, double salarioBase, int horasSemanales) {    
        //Constructor con parámetros
        super(nombre, apellido, edad, salarioBase);
        this.horasSemanales = horasSemanales;
    }

    @Override
    public double calcularSalario() {
        //Se calcula el salario tomando el salario base y multiplicandolo por las horas semanales
        double salario = this.getSalarioBase() * this.horasSemanales;
        //Para la compensación se toma el salario y se multiplica por 0.5
        double compensacion = salario * 0.5;
        //Se regresa el salario + la compensación
        return salario + compensacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de empleado: Apoyo\nHoras semanales: " + horasSemanales + "\nSalario total: " + calcularSalario();

    }
}
