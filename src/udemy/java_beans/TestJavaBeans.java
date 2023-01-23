package udemy.java_beans;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");

        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.getApellido());
    }
}
