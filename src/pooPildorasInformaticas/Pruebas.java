package pooPildorasInformaticas;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("Federico");
        Empleados trabajador2=new Empleados("Leandro");
        //Cambiamos la seccion del trabajador
        trabajador1.cambiaSeccion("RRHH");
        //Imprimimos los datos de los empleados
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }
}
class Empleados{
    public Empleados(String nombre){
        this.nombre=nombre;
        seccion="Administracion";
    }
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y trabaja en la seccion de: "+seccion;
    }
    private final String nombre;
    private String seccion;
}
