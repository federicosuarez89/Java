/*
    La interface Map almacena elementos de forma key:value
 */
package udemy.colecciones;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map miMapa = new HashMap<>();
        miMapa.put("Lunes","Primer dia de la semana");
        miMapa.put("Martes","Segundo dia de la semana");
        miMapa.put("Miercoles","Tercer dia de la semana");
        miMapa.put("Jueves","Cuarto dia de la semana");
        miMapa.put("Viernes","Quinto dia de la semana");
        miMapa.put("Sabado","Sexto dia de la semana");
        miMapa.put("Domingo","Septimo dia de la semana");

        String elemento = (String)miMapa.get("Miercoles");
        System.out.println(elemento);

        System.out.println(miMapa.keySet());
        System.out.println(miMapa.values());
    }
}
