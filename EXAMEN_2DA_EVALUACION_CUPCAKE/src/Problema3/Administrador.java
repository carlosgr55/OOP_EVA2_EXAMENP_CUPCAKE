package Problema3;

public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono {

    //El porcentaje se ingresa sin el simbolo de %, i.e. 62.5
    private double porcentajeBono;

    //Constructor default
    public Administrador() {
        super();
        porcentajeBono = 0.0;
    }

    //Constructor con argumentos
    public Administrador(double porcentajeBono, String ID, double salario, String nombre) {
        super(ID, salario, nombre);
        this.porcentajeBono = porcentajeBono;
    }

    //Método para calcular bono implementado de la interfaz
    @Override
    public double calcularBono() {
        //Se divide el porcentaje del bono entre 100 ya que esté se ingresa en su
        //Forma porcentual

        //El bono es una cantidad extra a la paga del empleado, por lo que
        //Este no puede quitarle dinero del salario base.s
        if (porcentajeBono < 0) {
            System.out.println("El bono no puede ser negativo");
        }
        double bono = salario * (porcentajeBono / 100);
        return Math.round(bono); //Se redondea el bono para no tener una gran cantidad de decimales
    }

    //Método para calcular salario con bono incluido
    @Override
    public double calcularSalario() {
        salario += calcularBono();
        if (salario <= 0) {
            System.out.println("El salario tiene que ser mayor a 0. Modifique los atributos necesarios");
        }
        return salario;
    }

    //Métodos get y set
    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

}
