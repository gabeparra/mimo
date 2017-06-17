package entity;
// Generated Jun 14, 2017 10:42:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Hora generated by hbm2java
 */
public class Hora  implements java.io.Serializable {


     private int idHora;
     private Integer hora;
     private Set bonos = new HashSet(0);

    public Hora() {
    }

	
    public Hora(int idHora) {
        this.idHora = idHora;
    }
    public Hora(int idHora, Integer hora, Set bonos) {
       this.idHora = idHora;
       this.hora = hora;
       this.bonos = bonos;
    }
   
    public int getIdHora() {
        return this.idHora;
    }
    
    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }
    public Integer getHora() {
        return this.hora;
    }
    
    public void setHora(Integer hora) {
        this.hora = hora;
    }
    public Set getBonos() {
        return this.bonos;
    }
    
    public void setBonos(Set bonos) {
        this.bonos = bonos;
    }




}


