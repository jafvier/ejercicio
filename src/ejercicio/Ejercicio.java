/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* estudiante Estudiante=new estudiante("alex", "Plascencia", "masculino", "1104");
         System.out.println(Estudiante.getNombre());*/
        int key = 0, anio;
        String nombre, apellido, genero, cedula, puesto;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 1 para estudiante, 2 para empleado");
        key = lector.nextInt();

        switch (key) {
            case 1:
                System.out.println("ingrese nombre del estudiante");
                nombre = lector.next();
                System.out.println("Ingrese el apellido del estudiante");
                apellido = lector.next();
                System.out.println("Ingrese la cedula del estudiante");
                cedula = lector.next();
                System.out.println("Ingrese el genero del estudiante");
                genero = lector.next();
                System.out.println("Ingrese el año de nacimiento del estudiante");
                anio = lector.nextInt();
                estudiante Estudiante = new estudiante(nombre, apellido, genero, cedula, anio);
                System.out.println("nombre: "+Estudiante.getNombre());
                System.out.println("apellido: "+Estudiante.getApellido());
                System.out.println("genero: "+Estudiante.getGenero());
                System.out.println("año de nacimiento: "+Estudiante.getAnio());
                System.out.println("edad: "+Estudiante.calcular()); 
                

                break;
            case 2:
                System.out.println("ingrese nombre del empleado");
                nombre = lector.next();
                System.out.println("Ingrese el apellido del empleado");
                apellido = lector.next();
                System.out.println("Ingrese el genero del empleado");
                genero = lector.next();
                System.out.println("Ingrese la cedula del empleado");
                cedula = lector.next();
                System.out.println("Ingrese el año de nacimiento del empleado");
                anio = lector.nextInt();
                System.out.println("Ingrese el cargo del empleado");
                puesto = lector.next();
                
                empleado Empleado = new empleado(nombre, apellido, genero, cedula, anio,puesto);
                System.out.println("nombre: "+Empleado.getNombre());
                System.out.println("apellido: "+Empleado.getApellido());
                System.out.println("genero: "+Empleado.getGenero());
                System.out.println("año de nacimiento: "+Empleado.getAnio());
                System.out.println("Cargo: "+Empleado.getPuesto());
                System.out.println("edad: "+Empleado.calcular());                
                break;

            default:
                System.out.println("no es una opcion");

                break;
        }



        //empleado a = new empleado("rene", "elizalde", "masculino", "11002","administrativo");       
        //a.setPuesto("docente");
        //System.out.println(a.getPuesto());       
    }
}