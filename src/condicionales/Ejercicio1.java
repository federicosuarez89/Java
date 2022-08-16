package condicionales;

import java.util.Scanner;

//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1= entrada.nextInt();   //se lee el primer numero
        System.out.println("Ingrese el segundo número");
        int num2= entrada.nextInt();   //se lee el segundo numero

        //estructura condicional para comprobar cual numero es mayor o si son iguales
        if (num1>num2){
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else if(num1==num2){
            System.out.println("Los numeros ingresados "+num1+" y "+num2+" son iguales");
        }
        else {
            System.out.println("El número "+num2+" es mayor que "+num1);
        }
    }
}
