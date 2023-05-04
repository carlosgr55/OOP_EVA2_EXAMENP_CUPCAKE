package Problema3;

public class EmpleadoTiempoCompleto extends Empleados {

    //Constructor default de la clase
    public EmpleadoTiempoCompleto() {
        super();
    }

    //Constructor con argumentos
    public EmpleadoTiempoCompleto(String ID, double salario, String nombre) {
        super(ID, salario, nombre);
    }

    //El método solo retorna el salario que fue definido al momentos de crear 
    //El objeto, el actual en caso de que haya sido modificado con el metodo set
    @Override
    public double calcularSalario() {
        if (salario <= 0) {
            System.out.println("El salario tiene que ser mayor a 0 pesos");
        }
        return salario;
    }

}
