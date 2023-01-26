
package programacion_concurrente.hilos;

public class ClasePrincipal {
    public static void main(String[] args) {
        //Instanciamos de la clase Proceso1 que hereda de la clase Thread
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();

        //Instanciamos de la clase Proceso2 que implementa la interfaz Runnable
        Thread hilo2 = new Thread(new Proceso2());

        //Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();




    }
}
