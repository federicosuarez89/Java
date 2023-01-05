/*
    -Crear clase Persona.
    -Crear variables las privadas edad, nombre y telefono de la clase Persona.
    -Crear gets y sets de cada propiedad.
 */
package openbootcamp.encapsulacion;

public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
