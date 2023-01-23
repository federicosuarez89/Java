package udemy.programacion_generica;

public class ClaseGenerica <T>{
    private T objeto;
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    public void getTipo(){
        System.out.println("El tipo T es: "+this.objeto.getClass().getSimpleName());
    }

}
