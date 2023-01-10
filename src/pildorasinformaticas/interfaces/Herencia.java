package pildorasinformaticas.interfaces;

public class Herencia extends Empleado implements Interfaces {

    private double incentivo;
    //Creamos el constructor de la clase Herencia
    public Herencia(String nom, double sueldo, int agno, int mes, int dia){
        super(nom,sueldo,agno,mes,dia);
    }
    public void setIncentivo(double b){
        incentivo = b;
    }
    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    @Override
    public String tomar_decisiones(String decision) {
        return "Un Jefe a tomado la decision: "+decision;
    }

    @Override
    public double establece_bonus(double aumento) {
        double prima = 2000;
        return Trabajadores.bonus_base + aumento + prima;
    }
}
