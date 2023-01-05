package openbootcamp.herencia;

public class Auto extends Vehiculo{
    @Override
    public String getSonido(){
        return "Soy un super sonido: "+this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
