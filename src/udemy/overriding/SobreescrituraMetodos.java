package udemy.overriding;

public class SobreescrituraMetodos {
    protected String nombre;
    protected double sueldo;

    public SobreescrituraMetodos(String nombre,double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDetalles(){
        return "Nombre: "+this.nombre+
                "\nSueldo: "+this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
