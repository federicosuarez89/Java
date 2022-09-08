/*
Escriba un programa que pida dos números enteros y escriba qué números son pares
y cuáles impares desde el primero hasta el segundo.
 */
package CicloFor;
import javax.swing.*;
public class Ejercicio1For {
    public static void main(String[] args) {
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int contarPares=0;
        int contarImpares=0;
        for (int i=num1;i<=num2;i++){
            if (i%2==0){
                contarPares++;
            }else {
                contarImpares++;
            }
        }
        System.out.println("Entre el numero "+num1+" y el numero "+num2+" hay "+contarPares+" pares");
        System.out.println("Entre el numero "+num1+" y el numero "+num2+" hay "+contarImpares+" impares");
    }
}
