package pildorasinformaticas.programacion_generica.arrayList;

import java.util.ArrayList;

public class TestEmpleado {
    public static void main(String[] args) {
        //Empleado [] listaEmpleados = new Empleado[3];
        //listaEmpleados[0] = new Empleado("Ana",45,2500);
        //listaEmpleados[1] = new Empleado("Antonio",55,2000);
        //listaEmpleados[2] = new Empleado("Maria",25,2600);

        ArrayList <Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio",55,2000));
        listaEmpleados.add(new Empleado("Maria",25,2600));
        listaEmpleados.add(new Empleado("Jose",35,2200));

        for (Empleado e:listaEmpleados) {
            System.out.println(e.getDatos());
        }
    }
}
