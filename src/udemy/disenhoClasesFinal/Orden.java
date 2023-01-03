package udemy.disenhoClasesFinal;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private static final int maxComputadoras = 10;
    private int contadorComputadoras;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.maxComputadoras){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite: "+Orden.maxComputadoras);
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden: "+this.idOrden);
        System.out.println("Computadoras de la orden: "+this.idOrden);
        for (int i=0;i<this.contadorComputadoras;i++){
            System.out.println(this.computadoras[i]);
        }
    }

}
