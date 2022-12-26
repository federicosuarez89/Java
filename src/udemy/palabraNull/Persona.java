package udemy.palabraNull;

public class Persona {
    //Atributo de la clase
    String nombre; //valor por default es null

    //Creamos el constructor de la clase
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
