package pildorasInformaticas.pooEmpleados.abstraccion;

abstract public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getDescripcion();







}
