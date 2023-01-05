package pildorasinformaticas.pooempleados.abstraccion;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {
    //Creamos las variables de clase
    private double sueldo;
    private Date altaContrato;
    private static int idSiguiente;
    private int id;

    //Creamos un constructor de la clase
    public Empleado(String nombre,double sueldo,int agno,int mes,int dia){
        super(nombre);
        this.sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
    }

    //Reescribiendo metodo abstracto de la clase padre
    public String getDescripcion(){
        return "Este empleado tiene un id: "+id+",con un sueldo: "+dameSueldo();
    }
    //creamos un getter(devuelve un valor)
    public double dameSueldo(){
        return this.sueldo;
    }
    //creamos un getter (devuelve un valor)
    public Date dameFechaContrato(){
        return this.altaContrato;
    }
    //creamos un setter(no devuelve valor)
    public void subeSueldo(double porcentaje){
        double aumento=this.sueldo*porcentaje/100;
        this.sueldo+=aumento;
    }
}
