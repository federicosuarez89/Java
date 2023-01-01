/*
    Crea una clase Persona con las siguientes variables:
    -La edad
    -El nombre
    -El teléfono
 */
package openBootcamp.ejercicioHerencia;

public class Persona {
    //Atributos de clase
    private int edad;
    private String nombre;
    private int telefono;

    //Creamos el constructor de la clase
    public Persona(String nombre, int edad, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    //Creamos los setter y getter

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Metodo toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----Persona----");
        sb.append("\nnombre:").append(nombre);
        sb.append("\nedad:").append(edad);
        sb.append("\ntelefono:").append(telefono);
        return sb.toString();
    }
}
