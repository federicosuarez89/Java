package openBootcamp.poo;

public class Moto extends Vehiculo{
    private boolean baul;

    public Moto(){}
    public Moto(String fabricante,String modelo,double cc, int anho,boolean sport,int speed,Motor motor, boolean baul) {
        super(fabricante,modelo,cc,anho,sport,speed,motor);
        this.baul = baul;
    }
}
