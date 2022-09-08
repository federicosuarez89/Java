/*
Escribir un programa que calcule el factorial de un numero ingresado por teclado
 */
package CicloFor;
import javax.swing.*;
public class Ejercicio4For {
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para calcular su factorial"));
        int factorial=1;
        for (int i=1;i<numero+1;i++){
            factorial=i*factorial;
        }
        System.out.println("El factorial del numero "+numero+" es "+factorial);
    }
}
