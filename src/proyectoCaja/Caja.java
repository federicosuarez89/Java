package proyectoCaja;

public class Caja {
    int ancho,alto,profundo;
    public Caja(){
        //Constructor vacio
    }
    public Caja(int ancho,int alto,int profundo){
        //Constructor con 3 argumentos
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    public int calculoVolumen(){
        int resultado = this.alto*this.ancho*this.profundo;
        return resultado;
    }
}
