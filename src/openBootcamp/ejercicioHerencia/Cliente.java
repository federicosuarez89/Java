/*
    Crea una nueva clase Cliente que herede de Persona.
    -esta nueva clase tendrá la variable credito solo
     para esa clase.
 */
package openBootcamp.ejercicioHerencia;

public class Cliente extends Persona{
    //Atributos de clase
    private int credito;

    //Constructor de clase
    public Cliente(String nombre, int edad,int telefono){
        super(nombre, edad, telefono);
    }

    //Setter y getter

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    //Metodo toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n--Cliente--");
        sb.append("\ncredito:").append(credito);
        return super.toString()+sb.toString();
    }
}
