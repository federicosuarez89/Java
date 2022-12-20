package pildorasInformaticas.pooEmpleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {
        Empleado [] misEmpleados=new Empleado[4];
        misEmpleados[0]=new Empleado("Federico Suarez",85000,2020,10,19);
        misEmpleados[1]=new Empleado("Ana Lopez",95000,2021,1,18);
        misEmpleados[2]=new Empleado("Maria Martin",80000,2022,8,20);
        misEmpleados[3]=new Empleado("Antonio Fernandez");

        for(Empleado e:misEmpleados){
            e.subeSueldo(5);
        }
        for (Empleado e:misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: " + e.dameSueldo()
                    + "\nFecha de alta: " + e.dameFechaContrato());
            System.out.println("---------------------------------");
        }
    }
}
//Creamos una nueva clase
class Empleado{

    //Creamos las variables de clase
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    //Creamos un constructor de la clase
    public Empleado(String nombre,double sueldo,int agno,int mes,int dia){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
    }
    //Creamos otro constructor para realizar sobrecarga de constructores
    public Empleado(String nombre){
        this(nombre,30000,2000,01,01);
    }

    //creamos un getter (devuelve un valor)
    public String dameNombre(){
        return nombre;
    }
    //creamos un getter(devuelve un valor)
    public double dameSueldo(){
        return sueldo;
    }
    //creamos un getter (devuelve un valor)
    public Date dameFechaContrato(){
        return altaContrato;
    }
    //creamos un setter(no devuelve valor)
    public void subeSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
}

