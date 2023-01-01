package udemy.poo.sobrecargaConstructores;

public class Test {
    public static void main(String[] args) {
        //Instanciamos un objeto
        Persona persona1 = new Persona("Leandro", 8);
        System.out.println(persona1);

        Empleado empleado1 = new Empleado("Yury",27,80000);
        System.out.println(empleado1);
    }
}
