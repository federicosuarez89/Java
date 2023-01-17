/*
    Los vectores se comportan como arrays dinamicos
    que me permiten agrandarlos segun la necesidad
 */

package openbootcamp.vectores;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Instanciamos un vector con capacidad de 50 e incremento de 15
        Vector<Integer> vector = new Vector<>(50,15);
        //Agregamos elementos al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        //Eliminamos datos del vector
        vector.remove(2);
        System.out.println(vector);
        //Averiguamos el tamaño del vector
        System.out.println("Tamanho: "+vector.size());
        //Averiguamos la capacidad del vector
        System.out.println("Capacidad: "+vector.capacity());

        //Instanciamos un vector con capacidad de 50 e incremento de 15
        Vector<Integer> vector2 = new Vector<>(50,15);
        //Agregamos elementos al vector
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);

        //Comparamos 2 vectores
        boolean resultado = vector.equals(vector2);
        System.out.println("¿Los vectores son iguales? "+resultado);

        //Recorremos un vector
        for (int i:vector) {
            System.out.println("Valor del vector: "+i);
        }


    }
}
