

// Juan Pedro Alvarez y Francisco Latorre

package dominio;

import java.io.Serializable;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Capataz implements Serializable{
    private String nombre;
    private String cedula;
    private String direccion;
    private int anoIngreso;
    
    public Capataz(String nombre, String cedula, String direccion, int anoIngreso){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.anoIngreso = anoIngreso;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String toString2(){
        return nombre + cedula + direccion + anoIngreso;
    }
    
}
