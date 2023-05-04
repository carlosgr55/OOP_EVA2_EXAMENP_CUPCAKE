package Problema2;

public abstract class Empleados2 implements Capturando {
    
    
    private String nombre; //Nombres del empleado
    private String apellido; //Apellidos del empleado
    private int edad; //Edad en años enteros
    public double salarioBase; //Salario base en pesos mexicanos

    public Empleados2() {
        // Constructor sin parámetros
        nombre = "....";
        apellido = "....";
        edad = 0;
        salarioBase = 0;
    }

    public Empleados2(String nombre, String apellido, int edad, double salarioBase) {   
        //Constructor con parámetros
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    // Implementación de los métodos de la interfaz Capture

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public double getSalarioBase() {
        return this.salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTipo() {
        return "";
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", edad=" + edad
                + ", salarioBase=" + salarioBase + ", tipo=" + getTipo() + '}';
    }
}
