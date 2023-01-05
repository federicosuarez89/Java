package openbootcamp.interfaces;

public class Test {
    public static void main(String[] args) {
        Auto Renault = new Auto();
        Moto Ducati = new Moto();
        ejecutaAcelerar(Renault);
        ejecutaAcelerar(Ducati);
    }
    public static void ejecutaAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
}
