/*
    -En este ejercicio tendréis que crear una clase SmartWatch
    -Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    -Crear constructor vacío y con todos los parámetros para cada clase.
 */
package openbootcamp.ejercicioPoo;

public class SmartWatch extends SmartDevices {
    private boolean sumergible;

    public SmartWatch(){}
    public SmartWatch(String marca,String modelo,boolean conexionInternet,boolean sumergible){
        super(marca,modelo,conexionInternet);
        this.sumergible = sumergible;
    }

    public boolean isSumergible() {
        return this.sumergible;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----SmartWatch----");
        sb.append("\nSumergible:").append(sumergible);
        return super.toString()+sb.toString();
    }
}
