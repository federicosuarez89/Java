package pildorasinformaticas.programacion_generica.arrayList;

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getDatos(){
        return "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nSueldo: "+this.sueldo;
    }
}
