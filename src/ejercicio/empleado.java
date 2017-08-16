/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Administrador
 */
public class empleado extends persona {

    private String puesto;

    public empleado(String nombre, String apellido, String cedula, String genero,int anio,String puesto) {
        super(nombre, apellido, genero, cedula,anio);
        this.puesto=puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }
    
}
