package inheritance;

import java.util.Date;

public class Cliente extends Person {
    private final int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegsitri, boolean vip, String nombre, 
            char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegsitri;
        this.vip = vip;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Es VIP: " + this.vip; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegsitri() {
        return fechaRegistro;
    }

    public void setFechaRegsitri(Date fechaRegsitri) {
        this.fechaRegistro = fechaRegsitri;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente {Cliente ID = ").append(this.idCliente);
        sb.append(", fechaRegistro = ").append(this.fechaRegistro);
        sb.append(", VIP = ").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    } 
    
}