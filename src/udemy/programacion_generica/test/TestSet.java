
package udemy.programacion_generica.test;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        System.out.println("\nImprimiendo con funcion lambda");
        getImprimirLambda(miSet);



    }
    public static void getImprimirLambda(Collection<String> collection){
        collection.forEach(e ->{
            System.out.println("e: "+e);
        });
    }
}
