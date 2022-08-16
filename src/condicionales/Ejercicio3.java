package condicionales;

import java.util.Scanner;

//Crea un programa que pida al usuario dos números y muestre el resultado de su división.
// Si el segundo número es 0, debe mostrar un mensaje de error.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);   //objeto que lee los datos ingresados por teclado
        System.out.println("Ingrese un numero");
        float num1= entrada.nextFloat();   //lectura del primer numero
        System.out.println("Ingrese otro numero");
        float num2= entrada.nextFloat();   //lectura del segundo numero
        float division;   //variable donde se guardara el resultado del cociente

        //condicional para realizar la division si num2 es diferente de cero
        if(num2!=0){
            division=num1/num2;
            System.out.println("El resultado del cociente entre "+num1+" y "+num2+" es "+division);
        }else {
            System.out.println("No se puede realizar la división porque el dividendo es igual a cero");
        }
    }
}
