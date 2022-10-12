package pooUdemy;

import pooUdemy.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        int operandoA=6;
        int operandoB=2;
        Aritmetica aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);

        //Creamos un segundo objeto
        Aritmetica aritmetica2=new Aritmetica(4,2);
        System.out.println("Resultado2= "+aritmetica2.sumar());

        //Creamos un tercer objeto
        Aritmetica aritmetica3=new Aritmetica(operandoA,operandoB);
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos la suma
        System.out.println("\nResultado suma: "+aritmetica3.sumar());
        //Imprimimos la resta
        System.out.println("Resultado resta: "+aritmetica3.restar());
        //Imprimimos la multiplicacion
        System.out.println("Resultado multiplicacion: "+aritmetica3.multiplicar());
        //Imprimimos la division
        System.out.println("Resultado division: "+aritmetica3.dividir());


    }
}
