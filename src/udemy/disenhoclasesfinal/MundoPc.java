package udemy.disenhoclasesfinal;

public class MundoPc {
    public static void main(String[] args) {
        //Creamos un objeto de tipo computadora
        Monitor monitorHp = new Monitor("HP",13);
        Teclado tecladoHp = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHp,tecladoHp,ratonHP);

        //Creamos otro objeto de tipo computadora
        Monitor monitorLG = new Monitor("LG",29);
        Teclado tecladoLG = new Teclado("USB","LG");
        Raton ratonLG = new Raton("USB","LG");
        Computadora computadoraLG = new Computadora("Computadora LG",monitorLG,tecladoLG,ratonLG);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLG);

        orden1.mostrarOrden();

    }
}
