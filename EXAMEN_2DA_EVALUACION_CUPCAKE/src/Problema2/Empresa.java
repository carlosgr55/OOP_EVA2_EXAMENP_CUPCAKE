package Problema2;

public class Empresa {
    
    //En esta clase se guarda el m�todo estatico para imprimir el salario

    //El m�todo recibe a un empleado como par�metro y con ese argumento obtiene
    //La informaci�n
    public static void imprimirSalario(Empleados2 empleado) {
        System.out.println("El salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es: $" + empleado.calcularSalario());
    }
}