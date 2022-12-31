package udemy.poo.herencia;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Leandro",90000);
        empleado1.setEdad(8);
        empleado1.setGenero('M');
        empleado1.setDireccion("Ballofet 120");
        System.out.println(empleado1);


        Cliente cliente1 = new Cliente(new Date(),true);
        cliente1.setNombre("Yury");
        System.out.println(cliente1);
    }
}
