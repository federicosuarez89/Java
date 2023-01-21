package pildorasinformaticas.programacion_generica.arrayList;

import java.util.ArrayList;

public class TestEmpleado {
    public static void main(String[] args) {
        //Empleado [] listaEmpleados = new Empleado[3];
        //listaEmpleados[0] = new Empleado("Ana",45,2500);
        //listaEmpleados[1] = new Empleado("Antonio",55,2000);
        //listaEmpleados[2] = new Empleado("Maria",25,2600);

        //Instanciamos un objeto de tipo ArrayList
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        //Definimos la capacidad minima del ArrayList
        listaEmpleados.ensureCapacity(12);

        //Rellenamos el ArrayList
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio",55,2000));
        listaEmpleados.add(new Empleado("Maria",25,2600));
        listaEmpleados.add(new Empleado("Jose",35,2200));
        listaEmpleados.add(new Empleado("Olga",39,2800));

        //Agregamos un elemento en una posicion especifica
        listaEmpleados.set(2,new Empleado("Federico",33,2600));

        //Extraemos un elemento en una posicion especifica
        System.out.println(listaEmpleados.get(2).getDatos());


        //Eliminamos el espacio sobrante del ArrayList
        //listaEmpleados.trimToSize();

        //Imprimimos la cantidad de elementos en el ArrayList
        System.out.println(listaEmpleados.size());
        for (Empleado e:listaEmpleados) {
            System.out.println(e.getDatos());
        }
    }
}
