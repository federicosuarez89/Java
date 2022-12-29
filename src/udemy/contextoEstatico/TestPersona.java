package udemy.contextoEstatico;

public class TestPersona {
    public static void main(String[] args) {
        //Instanciamos un primer objeto
        Persona persona1 = new Persona("Federico");
        System.out.println(persona1);
        //Instanciamos un segundo objeto
        Persona persona2 = new Persona("Yury");
        System.out.println(persona2);
        //Instanciamos un tercer objeto
        Persona persona3 = new Persona("Leandro");
        System.out.println(persona3);

        System.out.println("Contador personas: "+Persona.getIterator());


    }
}
