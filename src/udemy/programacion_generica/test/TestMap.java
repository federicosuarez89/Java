
package udemy.programacion_generica.test;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("Lunes", "Primer dia de la semana");
        miMapa.put("Martes", "Segundo dia de la semana");
        miMapa.put("Miercoles", "Tercer dia de la semana");
        miMapa.put("Jueves", "Cuarto dia de la semana");
        miMapa.put("Viernes", "Quinto dia de la semana");
        miMapa.put("Sabado", "Sexto dia de la semana");
        miMapa.put("Domingo", "Septimo dia de la semana");

        String elemento = miMapa.get("Miercoles");
        System.out.println(elemento);

        getImprimirLambda(miMapa.keySet());
        getImprimirLambda(miMapa.values());
    }

    public static void getImprimirLambda(Collection<String> collection) {
        collection.forEach(e -> {
            System.out.println("e: " + e);
        });
    }
}
