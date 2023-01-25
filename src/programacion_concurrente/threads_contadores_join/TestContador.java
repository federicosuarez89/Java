package programacion_concurrente.threads_contadores_join;

public class TestContador {
    public static void main(String[] args) {
        Contador contador1 = new Contador("primero",10);
        Contador contador2 = new Contador("segundo",8);
        Contador contador3 = new Contador("tercero",6);
        Contador contador4 = new Contador("cuarto",4);
        Contador contador5 = new Contador("quinto",3);

        Thread t1 = new Thread(contador1);
        Thread t2 = new Thread(contador2);
        Thread t3 = new Thread(contador3);
        Thread t4 = new Thread(contador4);
        Thread t5 = new Thread(contador5);

        //Iniciamos los hilos
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //La instruccion join() nos indica que hasta que todos los hilos no acaben
        //el programa no va a terminar
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FIN DEL PROGRAMA");

    }
}
