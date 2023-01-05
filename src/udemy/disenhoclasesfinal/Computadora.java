package udemy.disenhoclasesfinal;

public class Computadora {
    //Atributos de clase
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //Constructores de la clase
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    public Computadora(String nombre,Monitor monitor,Teclado teclado,Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Getter and setter

    public  int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    //Metodo toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----Computadora----");
        sb.append("\nidComputadoras: ").append(idComputadora);
        sb.append("\nnombre:").append(nombre);
        sb.append("\nmonitor:").append(monitor);
        sb.append("\nteclado:").append(teclado);
        sb.append("\nraton:").append(raton);
        return sb.toString();
    }
}
