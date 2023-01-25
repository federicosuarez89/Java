package programacion_concurrente.threads_contadores_join;

public class Contador implements Runnable{
    private int contador;
    private String nombreHilo;
    private int limiteContador;

    public Contador(String nombreHilo, int limiteContador) {
        this.contador = contador;
        this.nombreHilo = nombreHilo;
        this.limiteContador = limiteContador;
    }

    @Override
    public void run() {
        while (contador<=limiteContador){
            System.out.println("Hilo "+this.nombreHilo+":"+this.contador);
            contador++;
        }
    }
}
