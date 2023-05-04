package Problema3;

public class EmpleadoTiempoParcial extends Empleados {

    private double pagoPorHora;
    private int horasTrabajadas;

    //Constructor default
    public EmpleadoTiempoParcial() {
        super();
        pagoPorHora = 0.0;
        horasTrabajadas = 0;
    }

    //Constructor con argumentos
    public EmpleadoTiempoParcial(double pagoPorHora, int horasTrabajadas, String ID, String nombre) {
        super(ID,0, nombre); //Se omite el salario en los argumentos del constructor ya que no es 
        //Necesario para este tipo de empleado, por eso se tiene el pago por hora
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    //Método para calcular el salario
    @Override
    public double calcularSalario() {
        //Toma el Pago Por Hora del empleado y lo multiplica por las Horas Trabajadas y regresa este valor
        double pago = pagoPorHora * horasTrabajadas;
        
        //Para evitar errores, el pago solo puede ser positivo.
        if (pago < 0) {
            System.out.println("El pago no puede ser negativo, modifique los "
                    + "atributos necesarios");
        }

        return pago;
    }

    //Métodos get y set
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
