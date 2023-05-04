package Problema3;

public abstract class Empleados {

    private String ID; //Identificacion del empleado dentro de la empresa
    protected double salario; //Salario en pesos mexicanos con 2 decimales
    private String nombre; //Nombre completo del empleado

    //Constructor default
    public Empleados() {
        ID = "----";
        salario = 0.00;
        nombre = "----";
    }

    //Constructor con argumentos
    public Empleados(String ID, double salario, String nombre) {
        this.ID = ID;
        this.salario = salario;
        this.nombre = nombre;
    }

    //Métodos get and set para todos los atributos
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

}
