/*
    Son estructuras de datos que funcionan con clave: valor
 */


package openbootcamp.mapas;

import java.util.HashMap;
import java.util.Map;

public class TestMapas {
    public static void main(String[] args) {
        Map<String,String> personas = new HashMap<>();
        personas.put("123456789","Nombre Apellido 1");
        personas.put("12345678","Nombre Apellido 2");
        personas.put("1234567","Nombre Apellido 3");
        personas.put("123456","Nombre Apellido 4");
        System.out.println(personas);

        //Obtenemos las claves
        for (String key:personas.keySet()){
            System.out.println(key);
        }

        //Obtenemos los valores
        for (String values: personas.values()){
            System.out.println(values);
        }

        //Obtenemos clave = valor
        for (Map.Entry<String,String>entry: personas.entrySet()){
            System.out.println(entry);
        }
    }
}
