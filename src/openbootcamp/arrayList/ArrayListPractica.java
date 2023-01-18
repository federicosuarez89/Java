/*
    Un ArrayList es la implementacion de la interfaz list
    (de la superclase list),es muy similar a un vector.
    La diferencia con un vector es que los vectores tienen capacidad
     y los ArrayList tienen esa propiedad automatica, no la podemos
     modificar.El ArrayList toma su capacidad cuando se llena y la
     aumenta en un 50%.
 */

package openbootcamp.arrayList;

import java.util.ArrayList;

public class ArrayListPractica {
    public static void main(String[] args) {
        //Instanciamos un ArrayList
        ArrayList<String> lista = new ArrayList<>();

        //Añadimos elementos
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");

        System.out.println(lista);

        //Eliminamos elementos
        lista.remove("Elemento 3");
        System.out.println(lista);

        //Recorremos
        for (String nombre:lista) {
            System.out.println("Nombre: "+nombre);
        }
    }
}
