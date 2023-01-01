/*
    Crea ahora un objeto de la clase Cliente que debe tener
    como propiedades la edad, el telefono, el nombre y el credito,
    tienes que darles valor y mostrarlas por pantalla.
 */
package openBootcamp.ejercicioHerencia;

public class Test {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leandro", 8, 12346);
        cliente1.setCredito(40000);
        System.out.println(cliente1);

        Trabajador trabajador1 = new Trabajador("Yury",27,2613264);
        trabajador1.setSalario(35000);
        System.out.println(trabajador1);

    }
}
