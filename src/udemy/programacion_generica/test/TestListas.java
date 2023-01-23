package udemy.programacion_generica.test;

import java.util.*;

public class TestListas {
    public static void main(String[] args) {
        //Las listas guardan el orden en que son ingresados sus elementos
        List <String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        getImprimirLambda(miLista);
        
    }
    public static void getImprimirLambda(Collection<String> collection){
        collection.forEach(e ->{
            System.out.println("e: "+e);
        });
    }
}
