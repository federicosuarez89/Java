package openbootcamp.interfaces;

public class Moto implements Vehiculo{

    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto acelerando");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto frenando");
    }
}
