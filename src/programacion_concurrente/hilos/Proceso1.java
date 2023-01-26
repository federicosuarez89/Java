package programacion_concurrente.hilos;
//Creamos un hilo heredando de la clase Thread
public class Proceso1 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hilo 1 ejecutandose");
        }
    }
}
