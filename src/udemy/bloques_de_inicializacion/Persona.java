/*
    Deemos saber que antes de mandar a llamar el constructor de una clase,se ejecutan
    bloques de incialización que pueden ser estaticos o no estaticos(dinamico)
 */
package udemy.bloques_de_inicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estatico
    static {
        System.out.println("Ejecucion bloque de inicializacion estatico");
        ++contadorPersonas;
    }
    /*
        El bloque dinamico se ejecutará cada vez que instanciemos un objeto de tipo
        Persona
     */



    //Bloque de inicializacion no estatico
    {
        System.out.println("Ejecucion bloque de inicializacion no estatico(dinamico)");
        this.idPersona = Persona.contadorPersonas++;
    }
    /*
        El bloque dinamico se ejecutará cada vez que instanciemos un objeto de tipo
        Persona
     */

    //Constructor de la clase
    public Persona(){
        System.out.println("Se esta ejecutando el constructor de la clase");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----Persona----");
        sb.append("\nidPersona:").append(idPersona);
        return sb.toString();
    }
}

