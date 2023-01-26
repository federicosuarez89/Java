package programacion_concurrente.hilos;
//Creamos un hilo implementando la interfaz Runnable
public class Proceso2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hilo 2 ejecutandose");
        }
    }
}
