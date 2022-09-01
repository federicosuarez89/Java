package condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Hacer un programa para ingresar un número entre 1 y 12 y reportar el mes que le corresponde.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes que quiere conocer");
        int num= entrada.nextInt();
        switch (num){
            case 1:
                String mes="Enero";
                System.out.println("mes = " + mes);
                break;
            case 2:
                mes="Febrero";
                System.out.println("mes = " + mes);
                break;
            case 3:
                mes="Marzo";
                System.out.println("mes = " + mes);
                break;
            case 4:
                mes="Abril";
                System.out.println("mes = " + mes);
                break;
            case 5:
                mes="Mayo";
                System.out.println("mes = " + mes);
                break;
            case 6:
                mes="Junio";
                System.out.println("mes = " + mes);
                break;
            case 7:
                mes="Julio";
                System.out.println("mes = " + mes);
                break;
            case 8:
                mes="Agosto";
                System.out.println("mes = " + mes);
                break;
            case 9:
                mes="Septiembre";
                System.out.println("mes = " + mes);
                break;
            case 10:
                mes="Octubre";
                System.out.println("mes = " + mes);
                break;
            case 11:
                mes="Noviembre";
                System.out.println("mes = " + mes);
                break;
            case 12:
                mes="Diciembre";
                System.out.println("mes = " + mes);
                break;
        }
    }
}
