/*
   -Crea un proyecto de Java desde 0
   -Dentro del proyecto tenéis que crear un paquete.
   -En el paquete tendréis que crear una clase.
   -Dentro de la clase tenéis que crear el método main
    e imprimir todos los datos que se han visto en las sesiones.
   -Los tipos de datos más comunes son int, long, double, boolean, String.
 */

package openbootcamp.ejercicioTiposDatos;

public class TiposDeDatos {
    public static void main(String[] args) {
        int numeroEntero = 12;
        long numeroEnteroGrande = 123L;
        float numeroFloat = 1.234F;
        double numeroDouble = 1.23D;
        boolean valorBooleano = true;

        String cadena = "Soy una cadena";
        System.out.println("Tipo de dato entero: "+numeroEntero);
        System.out.println("Tipo de dato float: "+numeroFloat);
        System.out.println("Tipo de dato double: "+numeroDouble);
        System.out.println("Tipo de dato boolean: "+valorBooleano);
        System.out.println("Tipo de dato String: "+cadena);
    }
}
