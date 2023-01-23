package pildorasinformaticas.programacion_generica.herencia_tiposComodin;

public class Empleado {
    //Atributos de la clase
    private String nombre;
    private int edad;
    private double sueldo;

    //Constructor de la clase
    public Empleado(String nombre, int edad, double sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //Getter
    public String getDatos(){
        String retorno = "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nSueldo: "+this.sueldo;
        return retorno;
    }
}
