package udemy.poo.encapsulamiento;

public class Persona {
    //Atributos de clase
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Creamos el constructor de la clase
    public Persona(String nombre,double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //Creamos getter
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public boolean isEliminado(){
        return this.eliminado;
    }

    //Creamos setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    //Creamos el metodo toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append(", eliminado=").append(eliminado);
        sb.append('}');
        return sb.toString();
    }
}
