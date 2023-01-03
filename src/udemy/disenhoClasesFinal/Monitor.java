package udemy.disenhoClasesFinal;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanho;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor( String marca, double tamanho){
        this();
        this.marca = marca;
        this.tamanho = tamanho;

    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamanho;
    }

    public void setTamaño(double tamaño) {
        this.tamanho = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----Monitor----");
        sb.append("\nidMonitor:").append(idMonitor);
        sb.append("\nmarca:").append(marca);
        sb.append("\ntamanho:").append(tamanho);
        return sb.toString();
    }
}
