/*
    Para el bucle Do While, deberás crear la misma estructura que en el While,
    pero solo se debe ejecutar una vez.
 */
package openBootcamp.ejercicioEstructurasControl;

public class DoWhile {
    public static void main(String[] args) {
        int numeroWhile = 3;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);
    }
}
