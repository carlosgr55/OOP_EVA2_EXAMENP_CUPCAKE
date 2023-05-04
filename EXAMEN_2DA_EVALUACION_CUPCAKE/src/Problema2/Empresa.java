package Problema2;

public class Empresa {
    
    //En esta clase se guarda el método estatico para imprimir el salario

    //El método recibe a un empleado como parámetro y con ese argumento obtiene
    //La información
    public static void imprimirSalario(Empleados2 empleado) {
        System.out.println("El salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es: $" + empleado.calcularSalario());
    }
}