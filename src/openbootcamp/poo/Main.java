package openbootcamp.poo;

public class Main {
    public static void main(String[] args) {
        //Vehiculo toyotaEtios = new Vehiculo();
        Motor motorGti = new Motor("Gti",190,459.0,6);
        //Vehiculo fordFocus = new Vehiculo("Ford","Focus",2.1,2010,false,0,motorGti);
        Moto kawasakiNinja = new Moto();

        //Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Moto();
        vehiculo.acelerar(50);

        vehiculo = new Auto();
        vehiculo.acelerar(60);

        vehiculo = new Camion();
        vehiculo.acelerar(40);


        //Clases abstractas no se pueden instanciar (crear un objeto),solo se pueden
        //instanciar las clases hijas
    }
}
