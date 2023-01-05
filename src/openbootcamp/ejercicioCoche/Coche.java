/*
    -Crear una clase coche.
    -Dentro de la clase coche, una variable numérica que almacene
     el número de puertas que tiene.
    -Una función que incremente el número de puertas que tiene el coche.
    -Crear un objeto miCoche en el main y añadirle una puerta.
    -Mostrar el número de puertas que tiene el objeto.
 */
package openbootcamp.ejercicioCoche;

public class Coche {
    public int puertas = 3;

    public void sumaPuerta(){
        this.puertas++;
    }
}
