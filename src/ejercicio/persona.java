/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Administrador
 */
public class persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private String genero;
    private int anio;
    
    public persona(String nombre,String apellido, String cedula, String genero,int anio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.genero=genero;
        this.anio=anio;
        
    }   
  
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
   

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }
    public int getAnio() {
        return anio;
    }
    
    public int calcular(){
        int resultado=2014;
        resultado-=anio;
        
        return resultado;
    
    }
    
   
}
