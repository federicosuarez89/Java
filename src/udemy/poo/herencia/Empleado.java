package udemy.poo.herencia;

public class Empleado extends Persona{
    //Variables de clase
    private int idEmpleado;
    private int sueldo;
    private static int contarEmpleados;
    public Empleado(String nombre, int sueldo){
       super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++contarEmpleados;
    }

    public static int getContarEmpleados() {
        return contarEmpleados;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t--Datos del empleado--\nidEmpleado: "+this.idEmpleado+
                "\nsueldo: " + this.sueldo +"";
        }
    }

