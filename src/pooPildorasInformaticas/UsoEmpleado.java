package pooPildorasInformaticas;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*
        Empleado empleado1=new Empleado("Federico Suarez",85000,2020,10,19);
        Empleado empleado2=new Empleado("Ana Lopez",95000,2021,1,18);
        Empleado empleado3=new Empleado("Maria Martin",80000,2022,8,20);
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
        +" Fecha de alta: "+empleado1.dameFechaContrato());
        System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
                +" Fecha de alta: "+empleado2.dameFechaContrato());
        System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
                +" Fecha de alta: "+empleado3.dameFechaContrato());
         */
        Empleado [] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Federico Suarez",85000,2020,10,19);
        misEmpleados[1]=new Empleado("Ana Lopez",95000,2021,1,18);
        misEmpleados[2]=new Empleado("Maria Martin",80000,2022,8,20);
        for(Empleado e:misEmpleados){
            e.subeSueldo(5);
        }
        /*
        for (int i=0;i<3;i++){
            misEmpleados[i].subeSueldo(5);
        }
        */
        for (Empleado e:misEmpleados) {
            System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+e.dameSueldo()
            +" Fecha de alta: "+e.dameFechaContrato());
        }
         /*
        for (int i=0;i<3;i++){
            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()
            +" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
        }
          */
    }
}
//Creamos una nueva clase
class Empleado{
    public Empleado(String nombre,double sueldo,int agno,int mes,int dia){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
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
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
