//      INSTITUTO TECNOLÓGICO DE CHIHUAHUA II
//      INGENIERÍA EN SISTEMAS COMPUTACIONALES
//      PROGRAMACIÓN ORIENTADA A OBJETOS
//      EXAMEN PRÁCTICO UNIDAD II
//      EQUIPO: CUPCACKE (9-10)
/*          Carlos Rubén Gamboa Rosales | 22550334
            Rubén Eduardo Muñoz Nieto   | 22550341
            Luis Fernando García Pérez  | 22550366
            Derek Yadir Franco Martínez | 22550349
 */
package examen_2da_evaluacion_cupcake;

import Problema3.*;
import Problema2.*;
import Problema1.*;
public class EXAMEN_2DA_EVALUACION_CUPCAKE {

    public static void main(String[] args) {
        
        //PRUEBAS DEL PROBLEMA 1
        /*
        System.out.println("FORMULA UNO");
        Formula1 d1 = new Formula1(56.5, 24, 8);
        System.out.println(d1.calcularDistancia());
        System.out.println("FORMULA DOS");
        Formula2 d2 = new Formula2(42.00, 84.00, 64.00, 100.00);
        System.out.println(d2.calcularDistancia());
        Formula3 d3 = new Formula3(0.0, 15.00, 7.9, 8.2);
        System.out.println(d3.calcularDistancia());
        */
        
        

        //PRUEBAS DEL PROBLEMA 2
        /*
        Empleados2 manufactura = new Manufactura("Bjork", "Guomundsdotir", 25, 45, 40);
        Empleados2 apoyo = new Apoyo("Ethel", "Cain", 30, 20, 42);
        Empleados2 jefe = new Jefe("Lana", "Del Rey", 50, 5000);

        Empresa.imprimirSalario(manufactura);
        Empresa.imprimirSalario(apoyo);
        Empresa.imprimirSalario(jefe);
         */
        //PRUEBAS DEL PROBLEMA 3
        /*
        //COMPROBACIÓN DEL EMPLEADO DE TIEMPO COMPLETO
        System.out.println("EMPLEADO DE TIEMPO COMPLETO");      //Se hacen pruebas con los valores negativos
        EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto("MO1654", -54564, "Rosalía Vita");
        empTC.calcularSalario();
        empTC.setSalario(54564);
        System.out.println(empTC.calcularSalario() + "\n");
        
        //COMPROBACIÓN DEL EMPLEADO DE TIEMPO PARCIAL
        System.out.println("EMPLEADO DE TIEMPO PARCIAL");
        EmpleadoTiempoParcial empTP = new EmpleadoTiempoParcial(-652, 48, "AR561", "Arca Ghersi");
        empTP.calcularSalario();
        empTP.setPagoPorHora(652);
        System.out.println(empTP.calcularSalario());
        
        //COMPROBACIÓN DE ADMINISTRADOR
        System.out.println("ADMINISTRADOR");
        Administrador adm = new Administrador(-35.0, "LDR125", 48913, "Lana del Rey");
        adm.calcularSalario();
        adm.setPorcentajeBono(35.0);
        System.out.println(adm.calcularSalario());
         */
    }
}
