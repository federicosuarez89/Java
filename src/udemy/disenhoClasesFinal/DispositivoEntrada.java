package udemy.disenhoClasesFinal;

public class DispositivoEntrada {
    //Atributos de clase
    private String tipoEntrada;
    private String marca;

    //Constructor de la clase
    public DispositivoEntrada(String tipoEntrada,String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //Getter and setter
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----Dispositivo Entrada----");
        sb.append("\nTipo Entrada:").append(tipoEntrada);
        sb.append("\nMarca:").append(marca);
        return sb.toString();
    }
}
