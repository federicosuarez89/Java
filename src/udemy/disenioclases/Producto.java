package udemy.disenioclases;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor
    private Producto(){
        this.idProducto = ++contadorProductos;
    }
    //Constructor sobrecargado
    public  Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    //setter and getter
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    //metodo toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----Producto----");
        sb.append("\nidProducto:").append(idProducto);
        sb.append("\nnombre:").append(nombre);
        sb.append("\nprecio:").append(precio);
        return sb.toString();
    }
}
