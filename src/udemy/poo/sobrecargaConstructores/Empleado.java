package udemy.poo.sobrecargaConstructores;

public class Empleado extends Persona{
    //Atributo de clase
    private int sueldo;

    //Constructor 1
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    //Constructor sobrecargado 2
    public Empleado(String nombre,int edad, int sueldo){
        this(nombre, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n\t--Empleado--");
        sb.append("\n\tsueldo:").append(sueldo);
        return super.toString()+sb;
    }
}
