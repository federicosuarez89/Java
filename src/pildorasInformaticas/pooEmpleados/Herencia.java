package pildorasInformaticas.pooEmpleados;

public class Herencia extends Empleado{
    private double incentivo;
    //Creamos el constructor de la clase Herencia
    public Herencia(String nom,double sueldo,int agno, int mes, int dia){
        super(nom,sueldo,agno,mes,dia);
    }
    public void setIncentivo(double b){
        incentivo = b;
    }
    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }
}
