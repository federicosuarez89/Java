/*
    Set no mantiene el orden de los objetos ingresados por eso al imprimirlos
    se colocan en cualquier posicion. Tiene como ventaja es que trabaja con mas
    velocidad con sus elementos. Set desecha los elementos duplicados.
 */
package udemy.colecciones;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        System.out.println("Imprimiendo con bucle foreach");
        getImprimirForEach(miSet);

        System.out.println("\nImprimiendo con funcion lambda");
        getImprimirLambda(miSet);



    }
    public static void getImprimirForEach(Collection coleccion){
        for (Object e:coleccion) {
            System.out.println("e: " + e);
        }
    }

    public static void getImprimirLambda(Collection collection){
        collection.forEach(e ->{
            System.out.println("e: "+e);
        });
    }
}
