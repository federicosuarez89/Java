/*
    -En este ejercicio tendréis que crear una clase SmartDevice
    -Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    -Crear constructor vacío y con todos los parámetros para cada clase.
 */
package openbootcamp.ejercicioPoo;

public abstract class SmartDevices {
    private String marca;
    private String modelo;
    private boolean conexionInternet;

    public SmartDevices(){}

    public SmartDevices(String marca, String modelo, boolean conexionInternet) {
        this.marca = marca;
        this.modelo = modelo;
        this.conexionInternet = conexionInternet;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isConexionInternet() {
        return this.conexionInternet;
    }

    public void setConexionInternet(boolean conexionInternet) {
        this.conexionInternet = conexionInternet;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----SmartDevices----");
        sb.append("\nMarca:").append(marca);
        sb.append("\nModelo:").append(modelo);
        sb.append("\nConexion a Internet:").append(conexionInternet);
        return sb.toString();
    }
}
