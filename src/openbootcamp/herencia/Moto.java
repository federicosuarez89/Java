package openbootcamp.herencia;

public class Moto extends Auto{
    @Override
    public String getSonido() {
        return "Soy un sonido de moto: "+this.sonido;
    }
    @Override
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
