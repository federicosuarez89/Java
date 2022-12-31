package udemy.poo.herencia;

import java.util.Date;

public class Cliente extends Persona{
    //Variables de clase
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contarClientes;

    //Creamos un constructor de la clase
    public Cliente(Date fechaRegistro, boolean vip){
        this.idCliente = ++contarClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    //Creamos los setter y getter de la clase

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContarClientes() {
        return contarClientes;
    }

    @Override
    public String toString() {
        return super.toString()+"Clientes: \nidClientes: "+this.idCliente+
                "\nfecha registro: "+this.fechaRegistro+
                "\nvip: "+this.vip;
    }
}
