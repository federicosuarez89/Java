package pildorasInformaticas.pooEmpleados;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("Federico");
        Empleados trabajador2=new Empleados("Leandro");
        Empleados trabajador3=new Empleados("Antonio");
        Empleados trabajador4=new Empleados("Maria");
        //Cambiamos la seccion del trabajador
        trabajador1.cambiaSeccion("RRHH");
        //Imprimimos los datos de los empleados
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
        System.out.println(Empleados.dameIdSiguiente());
    }
}
class Empleados{
    public Empleados(String nombre){
        this.nombre=nombre;
        seccion="Administracion";
        id=idSiguiente;
        idSiguiente++;
    }
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y trabaja en la seccion de: "+seccion+" y el id: "+
                id ;
    }
    public static String dameIdSiguiente(){
        return "El id siguiente es: "+idSiguiente;
    }
    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=1;
}
