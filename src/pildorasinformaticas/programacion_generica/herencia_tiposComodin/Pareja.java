package pildorasinformaticas.programacion_generica.herencia_tiposComodin;

public class Pareja<T>{
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

    /*
        Con la expresion ? extends, lo que logramos es extender este metodo
        a todos los objetos de tipo Empleado y a la vez a objetos de subclases
        del tipo Empleado
     */
    public static void getTrabajador(Pareja<? extends Empleado> p){
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }
}
