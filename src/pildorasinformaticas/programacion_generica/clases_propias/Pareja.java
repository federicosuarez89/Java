package pildorasinformaticas.programacion_generica.clases_propias;

public class Pareja <T>{
    //Atributo generico de la clase
    private T primero;

    //Constructor de la clase generica
    public Pareja(){primero = null;}

    //Metodo Setter generico
    public void setPrimero(T primero){
        this.primero = primero;
    }

    //Metodo getter generico
    public T getPrimero() {
        return primero;
    }
}
