package entity;
// Generated Jun 14, 2017 10:42:03 PM by Hibernate Tools 4.3.1



/**
 * DetalleBono generated by hbm2java
 */
public class DetalleBono  implements java.io.Serializable {


     private int codPrestacion;
     private Bono bono;
     private Medico medico;
     private String nombrePrestacion;
     private int cantidad;
     private int valorPrestacion;
     private int convenioPrestacion;
     private int copago;

    public DetalleBono() {
    }

	
    public DetalleBono(int codPrestacion, Medico medico, String nombrePrestacion, int cantidad, int valorPrestacion, int convenioPrestacion, int copago) {
        this.codPrestacion = codPrestacion;
        this.medico = medico;
        this.nombrePrestacion = nombrePrestacion;
        this.cantidad = cantidad;
        this.valorPrestacion = valorPrestacion;
        this.convenioPrestacion = convenioPrestacion;
        this.copago = copago;
    }
    public DetalleBono(int codPrestacion, Bono bono, Medico medico, String nombrePrestacion, int cantidad, int valorPrestacion, int convenioPrestacion, int copago) {
       this.codPrestacion = codPrestacion;
       this.bono = bono;
       this.medico = medico;
       this.nombrePrestacion = nombrePrestacion;
       this.cantidad = cantidad;
       this.valorPrestacion = valorPrestacion;
       this.convenioPrestacion = convenioPrestacion;
       this.copago = copago;
    }
   
    public int getCodPrestacion() {
        return this.codPrestacion;
    }
    
    public void setCodPrestacion(int codPrestacion) {
        this.codPrestacion = codPrestacion;
    }
    public Bono getBono() {
        return this.bono;
    }
    
    public void setBono(Bono bono) {
        this.bono = bono;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public String getNombrePrestacion() {
        return this.nombrePrestacion;
    }
    
    public void setNombrePrestacion(String nombrePrestacion) {
        this.nombrePrestacion = nombrePrestacion;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getValorPrestacion() {
        return this.valorPrestacion;
    }
    
    public void setValorPrestacion(int valorPrestacion) {
        this.valorPrestacion = valorPrestacion;
    }
    public int getConvenioPrestacion() {
        return this.convenioPrestacion;
    }
    
    public void setConvenioPrestacion(int convenioPrestacion) {
        this.convenioPrestacion = convenioPrestacion;
    }
    public int getCopago() {
        return this.copago;
    }
    
    public void setCopago(int copago) {
        this.copago = copago;
    }




}


