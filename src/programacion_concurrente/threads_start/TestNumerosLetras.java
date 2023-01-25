/*
    Ejercicio: crear 2 hilos de ejecucion donde se impriman los numeros del 1-30
    y los caracteres de a-z paralelamente
 */
package programacion_concurrente.threads_start;

public class TestNumerosLetras {
    public static void main(String[] args) {
        //Creamos 2 objetos de tipo NumerosLetras
        NumerosLetras hilo1 = new NumerosLetras(1);
        NumerosLetras hilo2 = new NumerosLetras(2);

        //Creamos 2 objetos de tipo Thread y le asignamos la variable hilo1 e hilo2
        //como parametro
        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilo2);

        //Iniciamos los hilos
        t1.start();
        t2.start();
    }
}
