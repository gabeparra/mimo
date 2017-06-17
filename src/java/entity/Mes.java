package entity;
// Generated Jun 14, 2017 10:42:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mes generated by hbm2java
 */
public class Mes  implements java.io.Serializable {


     private int idMes;
     private Anio anio;
     private Integer mes;
     private String nombreMes;
     private Set dias = new HashSet(0);

    public Mes() {
    }

	
    public Mes(int idMes) {
        this.idMes = idMes;
    }
    public Mes(int idMes, Anio anio, Integer mes, String nombreMes, Set dias) {
       this.idMes = idMes;
       this.anio = anio;
       this.mes = mes;
       this.nombreMes = nombreMes;
       this.dias = dias;
    }
   
    public int getIdMes() {
        return this.idMes;
    }
    
    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }
    public Anio getAnio() {
        return this.anio;
    }
    
    public void setAnio(Anio anio) {
        this.anio = anio;
    }
    public Integer getMes() {
        return this.mes;
    }
    
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public String getNombreMes() {
        return this.nombreMes;
    }
    
    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }
    public Set getDias() {
        return this.dias;
    }
    
    public void setDias(Set dias) {
        this.dias = dias;
    }




}

