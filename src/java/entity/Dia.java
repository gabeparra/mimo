package entity;
// Generated Jun 14, 2017 10:42:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dia generated by hbm2java
 */
public class Dia  implements java.io.Serializable {


     private int idDia;
     private Mes mes;
     private Integer dia;
     private String nombreDia;
     private Set bonos = new HashSet(0);

    public Dia() {
    }

	
    public Dia(int idDia) {
        this.idDia = idDia;
    }
    public Dia(int idDia, Mes mes, Integer dia, String nombreDia, Set bonos) {
       this.idDia = idDia;
       this.mes = mes;
       this.dia = dia;
       this.nombreDia = nombreDia;
       this.bonos = bonos;
    }
   
    public int getIdDia() {
        return this.idDia;
    }
    
    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }
    public Mes getMes() {
        return this.mes;
    }
    
    public void setMes(Mes mes) {
        this.mes = mes;
    }
    public Integer getDia() {
        return this.dia;
    }
    
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    public String getNombreDia() {
        return this.nombreDia;
    }
    
    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }
    public Set getBonos() {
        return this.bonos;
    }
    
    public void setBonos(Set bonos) {
        this.bonos = bonos;
    }




}

