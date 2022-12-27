package udemy.poo.encapsulamiento;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Federico",90000,false);
        //Imprimimos el nombre a traves del getter
        System.out.println("Nombre persona: "+persona1.getNombre());
        //Modificamos el nombre a traves del setter
        persona1.setNombre("Juan");
        System.out.println("Ahora el nombre es: "+persona1.getNombre());

        System.out.println("***************************************");
        //Traemos todos los elementos del objeto con el metodo toString
        System.out.println(persona1);
    }
}
