package entity;
// Generated Jun 14, 2017 10:42:03 PM by Hibernate Tools 4.3.1



/**
 * Cajero generated by hbm2java
 */
public class Cajero  implements java.io.Serializable {


     private int idCajero;
     private Supervisor supervisor;
     private String rutCajero;
     private String nombreCajero;

    public Cajero() {
    }

	
    public Cajero(int idCajero) {
        this.idCajero = idCajero;
    }
    public Cajero(int idCajero, Supervisor supervisor, String rutCajero, String nombreCajero) {
       this.idCajero = idCajero;
       this.supervisor = supervisor;
       this.rutCajero = rutCajero;
       this.nombreCajero = nombreCajero;
    }
   
    public int getIdCajero() {
        return this.idCajero;
    }
    
    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }
    public Supervisor getSupervisor() {
        return this.supervisor;
    }
    
    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
    public String getRutCajero() {
        return this.rutCajero;
    }
    
    public void setRutCajero(String rutCajero) {
        this.rutCajero = rutCajero;
    }
    public String getNombreCajero() {
        return this.nombreCajero;
    }
    
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }




}


