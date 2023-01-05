package openbootcamp.herencia;

abstract public class Vehiculo {
    //Atributos de clase
     int velocidadMaxima;
     String patente;
     String sonido;

    //Cronstructor
    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    //Getter and setter
    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}
