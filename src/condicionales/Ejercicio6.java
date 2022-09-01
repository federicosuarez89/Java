package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Programa que pregunta al usuario 2 numeros y luego que operacion quiere realizar
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float num1= entrada.nextFloat();
        System.out.println("Ingreso otro numero: ");
        float num2= entrada.nextFloat();
        System.out.println("Ingrese la operacion a realizar entre los numeros");
        System.out.println("1:suma\n2:resta\n3:multiplicacion\n4:division");
        int opcion= entrada.nextInt();
        switch (opcion){
            case 1:
                float suma=num1+num2;
                System.out.println("Has escogido la suma entre"+num1+" y "+num2);
                System.out.println("El resultado es: "+suma);
                break;
            case 2:
                float resta =num1-num2;
                System.out.println("Has escogido la resta entre"+num1+" y "+num2);
                System.out.println("El resultado es: "+resta);
                break;
            case 3:
                float producto=num1*num2;
                System.out.println("Has escogido el producto entre"+num1+" y "+num2);
                System.out.println("El resultado es: "+producto);
                break;
            case 4:
                System.out.println("Has escogido el cociente entre"+num1+" y "+num2);
                if (num2 == 0){
                    System.out.println("No se puede realizar division por cero");
                }else {
                    float division=num1/num2;
                    System.out.println("El resultado es: "+division);
                }
                break;
        }
    }
}
