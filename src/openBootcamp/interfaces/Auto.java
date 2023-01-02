package openBootcamp.interfaces;

public class Auto implements Vehiculo{
    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Auto acelerando");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Auto frenando");
    }
}
