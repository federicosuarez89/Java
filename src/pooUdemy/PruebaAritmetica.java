package pooUdemy;

import pooUdemy.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);
        //Creamos un segundo objeto
        Aritmetica aritmetica2=new Aritmetica(4,2);
        System.out.println("Resultado2= "+aritmetica2.sumar());
        
    }
}
