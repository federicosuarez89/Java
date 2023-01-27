package programacion_concurrente.hilos_con_parametros;

public class Proceso extends Thread{
    private int parametro;

    public Proceso(String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){
        for (int i=0;i<=this.parametro;i++){
            System.out.println(this.getName()+"valor:"+i);
        }
        System.out.println("Terminando el hilo");
    }

    public void valorCondicion(int parametro){
        this.parametro = parametro;

    }
}
