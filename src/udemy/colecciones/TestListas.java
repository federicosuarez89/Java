package udemy.colecciones;

import java.util.*;

public class TestListas {
    public static void main(String[] args) {
        //Las listas guardan el orden en que son ingresados sus elementos
        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        System.out.println("Recorriendo la lista con bucle foreach");
        for (Object e:miLista) {
            System.out.println("e = " + e);
        }
        
        //Tambien podemos recorrer nuestra lista con arrow functions ->
        // (lambda functions)
        System.out.println("\nRecorriendo la lista con arrow functions o tambien" +
                " llamadas funciones lambda");
        miLista.forEach(e ->{
            System.out.println("e = " + e);
        });
        
    }
}
