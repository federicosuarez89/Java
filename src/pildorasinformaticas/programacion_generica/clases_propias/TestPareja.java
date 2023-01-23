package pildorasinformaticas.programacion_generica.clases_propias;

public class TestPareja {
    public static void main(String[] args) {
        //Instanciamos un objeto de clase Pareja
        Pareja<String> pareja1 = new Pareja<>();

        //Cambiamos el valor de null que habiamos definido
        pareja1.setPrimero("Federico");

        //Imprimimos el valor seteado
        System.out.println(pareja1.getPrimero());

        //Instanciamos otro objeto de tipo Persona
        Persona persona1 = new Persona("Ana");

        //Instanciamos otro objeto de tipo Pareja
        Pareja<Persona> pareja2 = new Pareja<>();

        //Cambiamos el valor de null que habiamos definido
        pareja2.setPrimero(persona1);

        //Imprimimos el valor seteado
        System.out.println(pareja2.getPrimero());

    }
}
