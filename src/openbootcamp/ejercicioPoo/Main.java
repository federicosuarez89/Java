/*
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus
    valores por consola.
 */
package openbootcamp.ejercicioPoo;

public class Main {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("Iphone","XS",true,40,12,"Gold");
        SmartWatch reloj = new SmartWatch("Xiaomi","12",false,true);
        System.out.println(celular);
        System.out.println(reloj);
    }
}
