package pooUdemy;

import pooUdemy.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar(5,3);
        System.out.println("resultado = " + resultado);
    }
}
