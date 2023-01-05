package openbootcamp.encapsulacion;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(8);
        persona1.setNombre("Leandro");
        persona1.setTelefono(123456);
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Telefono: "+persona1.getTelefono());
    }
}
