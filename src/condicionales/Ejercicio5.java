package condicionales;

import java.util.Scanner;

//Realiza un programa que clasifique un triángulo por el tamaño de sus lados. Se debe clasificar
// como triángulo  isósceles, equilátero o escaleno.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);   //objeto que lee los datos ingresados
        System.out.println("Ingrese el valor del primer lado");
        int lado1= entrada.nextInt();  //se lee primer lado
        System.out.println("Ingrese el valor del segundo lado");
        int lado2= entrada.nextInt();  //se lee segundo lado
        System.out.println("Ingrese el valor de tercer lado");
        int lado3= entrada.nextInt();  //se lee tercer lado

        //condicional para clasificar los triangulos en funcion de
        //3 lados iguales equilatero,2 iguales isosceles y 3 diferentes escaleno
        if (lado1==lado2 && lado2==lado3){
            System.out.println("El triangulo es equilatero");
        }else if(lado1==lado2 && lado1!=lado3){
            System.out.println("El triangulo es isosceles");
        }else {
            System.out.println("El triangulo es escaleno");
        }

    }
}
