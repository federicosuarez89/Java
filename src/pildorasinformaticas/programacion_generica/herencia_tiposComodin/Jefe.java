package pildorasinformaticas.programacion_generica.herencia_tiposComodin;

public class Jefe extends Empleado{

    //Constructor de la clase
    public Jefe(String nombre, int edad, double sueldo){
        super(nombre, edad, sueldo);
    }

    double premio(double dinero){
        return dinero;
    }
}
