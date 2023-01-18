package pildorasinformaticas.serializacion;

import java.io.Serializable;
import java.util.*;

public class Empleado implements Serializable {
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    public Empleado(String nombre,double sueldo,int anho,int mes,int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anho,mes,dia);
        fechaContrato = calendario.getTime();
    }
    public String getNombre(){return this.nombre;}
    public double getSueldo(){return sueldo;}
    public void subirSueldo(double porcentaje){
        double aumento = this.sueldo * porcentaje/100;
        this.sueldo+=aumento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre:"+nombre);
        sb.append("sueldo:"+sueldo);
        sb.append("fecha contratacion:"+fechaContrato);
        sb.append('}');
        return sb.toString();
    }
}
