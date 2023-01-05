/*
    Si ponemos la palabra final en la clase lo que esto significa es que ya no podremos crear
    hijas de esta clase. O sea esta clase no hereda sus atributos y métodos a nadie más.
 */
package udemy.palabrafinal;

public final class ClaseFinal {
    //Esta variable ya no podrá ser modificada nunca mas
    public final int numero = 12;

    //La variable varPersona ya no podra apuntar a otra referencia de otro objeto
    public static final Persona varPersona = new Persona();

    public final void metodoFinal(){
        //El metodoFinal ya no podrá ser sobreescrito en una clase hija
    };
}
