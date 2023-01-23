package pildorasinformaticas.programacion_generica.metodos_genericos;

import pildorasinformaticas.programacion_generica.arrayList.Empleado;

public class MetodosGenericos {
    public static void main(String[] args) {
        //Creamos un array de Strings
        String[] nombres = {"Jose", "Maria", "Pepe"};

        //Guardamos la longitud del array
        String cantidadValores = MisMatrices.getElemntosArray(nombres);
        System.out.println(cantidadValores);

        Empleado [] listaEmpleados = {new Empleado("Ana",45,25000),
                new Empleado("Ana Maria",35,2000)};
        System.out.println(MisMatrices.getElemntosArray(listaEmpleados));

        System.out.println(MisMatrices.getDatoMenor(nombres));

    }
}
