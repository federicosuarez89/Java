/*
Escriba un programa que pregunte cuantos números se van a introducir, pida esos números
(que puedan ser decimales) y calcule su suma.
 */
package ciclofor;
import javax.swing.*;
public class Ejercicio3For {
    public static void main(String[] args) {
        int cantidadNum=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros se van a ingresar"));
        float sumatoria=0;
        for (int i=0;i<cantidadNum;i++){
            float numSumar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero a sumar"));
            sumatoria=numSumar+sumatoria;
        }
        System.out.println("La suma de los numeros ingresados es: "+sumatoria);
    }
}
