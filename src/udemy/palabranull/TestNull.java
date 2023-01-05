package udemy.palabranull;

public class TestNull {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Persona
        Persona p1 = new Persona("Federico");
        System.out.println("Nombre p1: "+p1.getNombre());

        //Creamos otro objeto de tipo Persona
        Persona p2 = p1; //p2 apunta al mismo objeto que p1
        System.out.println("Nombre p2: "+p2.getNombre());

        //Hacemos que p1 ya no apunte a ese objeto
        p1 = null;
        if (p1 != null){
            System.out.println("p1: "+p1.getNombre());
        }else {
            System.out.println("La variable p1 no apunta a ningun objeto");
        }

        //Comproamos que p2 sigue accediendo al objeto
        System.out.println("Nombre p2: "+p2.getNombre());
    }
}
