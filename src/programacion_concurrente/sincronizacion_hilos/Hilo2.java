package programacion_concurrente.sincronizacion_hilos;

public class Hilo2 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.print("E");
            try {
                Hilo2.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Error en la clase Hilo1");
            }
        }
    }
}
