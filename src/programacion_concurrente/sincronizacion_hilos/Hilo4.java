package programacion_concurrente.sincronizacion_hilos;

public class Hilo4 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.print("E");
            System.out.print("\n");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Error en la clase Hilo1");
            }
        }
    }

}
