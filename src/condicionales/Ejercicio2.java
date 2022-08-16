package condicionales;

import java.util.Scanner;

//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num= entrada.nextInt();   //se lee el numero ingresado

        //Estructura condicional con operador ternario que determina si el numero es par o impar
        System.out.println((num%2==0)?"El numero es par":"El numero es impar");
    }
}
