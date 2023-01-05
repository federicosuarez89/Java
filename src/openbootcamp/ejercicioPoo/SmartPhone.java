/*
    -En este ejercicio tendréis que crear una clase SmartPhone
    -Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    -Crear constructor vacío y con todos los parámetros para cada clase.
 */
package openbootcamp.ejercicioPoo;

public class SmartPhone extends SmartDevices{
    private int mgPixelesCamaraTrasera;
    private int mgPixelesCamaraDelantera;
    private String color;

    public SmartPhone(){}
    public SmartPhone(String marca,String modelo,boolean conexionInternet,int mgPixelesCamaraTrasera,int mgPixelesCamaraDelantera,String color){
        super(marca,modelo,conexionInternet);
        this.mgPixelesCamaraTrasera = mgPixelesCamaraTrasera;
        this.mgPixelesCamaraDelantera = mgPixelesCamaraDelantera;
        this.color = color;
    }

    public int getMgPixelesCamaraTrasera() {
        return this.mgPixelesCamaraTrasera;
    }

    public void setMgPixelesCamaraTrasera(int mgPixelesCamaraTrasera) {
        this.mgPixelesCamaraTrasera = mgPixelesCamaraTrasera;
    }

    public int getMgPixelesCamaraDelantera() {
        return this.mgPixelesCamaraDelantera;
    }

    public void setMgPixelesCamaraDelantera(int mgPixelesCamaraDelantera) {
        this.mgPixelesCamaraDelantera = mgPixelesCamaraDelantera;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----SmartPhone----");
        sb.append("\nMega Pixeles Camara Trasera:").append(mgPixelesCamaraTrasera);
        sb.append("\nMega PixelesCamaraDelantera:").append(mgPixelesCamaraDelantera);
        sb.append("\nColor:").append(color);
        return super.toString()+sb.toString();
    }
}
