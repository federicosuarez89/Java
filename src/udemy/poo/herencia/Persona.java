package udemy.poo.herencia;

public class Persona {     //Clase padre o super clase
    //Variables de clase
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    //Creamos constructor vacio
    public Persona(){

    }
    //Creamos otro constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }
    //Creamos un tercer constructor
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "************ Objeto de tipo Persona ************\nnombre: "+
                nombre+"\ngenero: "+genero+"\nedad: "+edad+"\ndireccion: "+direccion;
    }
}
