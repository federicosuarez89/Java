package condicionales;

import java.util.Locale;
import java.util.Scanner;

//Realiza un programa que calcule la aceptación de una solicitud en base a
// los siguientes parámetros: edad, nota y sexo.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);  //objeto que lee los datos ingresados
        System.out.println("Ingrese su edad");
        int edad= entrada.nextInt();   //variable que guarda la edad
        System.out.println("Ingrese su nota de evaluacion de 0 a 10");
        int nota=entrada.nextInt();   //variable que guarda la nota
        System.out.println("Ingrese si es hombre (HOMBRE) o si es mujer (MUJER)");
        String sexo= entrada.next();   //variable que guarda el sexo

        //condicional para ver si el candidato es apto en funcion de tener mas de 18 años
        //tener una nota mayor o igual que 7 y ser varon
        if (edad>=18 && nota>=7 && nota<=10 && sexo.toUpperCase().equals("HOMBRE")){
            System.out.println("El candidato cumple con los requisitos,es apto para ingresar");
        }else {
            System.out.println("El candidato no cumple con los requisitos,no es apto para ingresar");
        }


    }
}
