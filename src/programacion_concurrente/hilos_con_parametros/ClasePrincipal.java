package programacion_concurrente.hilos_con_parametros;

public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso(" -Hilo 1-");
        Proceso hilo2 = new Proceso(" -Hilo 2-");
        Proceso hilo3 = new Proceso(" -Hilo 3-");

        hilo1.valorCondicion(5);
        hilo2.valorCondicion(10);
        hilo3.valorCondicion(8);

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
