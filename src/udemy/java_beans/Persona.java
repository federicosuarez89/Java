/*
    Para que una clase en Java se considere como un Java Bean debe de cumplir
    las siguientes caracteristicas:
        -Tener un constructor vacio.
        -Todos sus atributos deben ser private.
        -Cada atributo debe tener un metodo setter y getter asociado.
        -Debe implementar una interface llamada serializable.
    Esto nos permite que otras tecnologias y frameworks utilicen nuestras clases.
 */

package udemy.java_beans;

import java.io.Serializable;

public class Persona implements Serializable {
    //Atributos de clase
    private String nombre;
    private String apellido;

    //Constructor vacio
    public Persona(){}

    //Otro constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter and setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre:").append(nombre);
        sb.append(", apellido:").append(apellido);
        sb.append('}');
        return sb.toString();
    }
}
