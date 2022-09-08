//Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.
package CicloFor;
import javax.swing.*;
import java.util.Scanner;
public class Ejercicio2For {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero mayor que cero");
        int numIngresado= entrada.nextInt();
        int num=0;
        while (numIngresado<num){
            numIngresado= Integer.parseInt(JOptionPane.showInputDialog("Error: Ingrese uno mayor que cero"));
        }
        for (int i=1;i<numIngresado+1;i++){
            if (numIngresado%i==0){
                int divisores=i;
                System.out.println("El numero "+divisores+" es divisor de "+numIngresado);
            }
        }
        System.out.println("El numero 0 es divisor de "+numIngresado);
    }
}