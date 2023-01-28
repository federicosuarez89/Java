package programacion_concurrente.sincronizacion_hilos;

public class Hilo3 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.print("D");
            try {
                Hilo3.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Error en la clase Hilo1");
            }
        }
    }
}
