package udemy.poo.sobrecargaConstructores;

public class Persona {
    //Atributos de clase
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    //Constructor 1
    private Persona(){
        this.idPersona = ++contadorPersonas;
    }
    //Constructor 2
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter and setter
    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----Persona----\n");
        sb.append("\tidPersona:").append(idPersona);
        sb.append("\n\tnombre:'").append(nombre).append('\'');
        sb.append("\n\tedad:").append(edad);
        return sb.toString();
    }
}
