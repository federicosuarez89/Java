/*
    Usando un if, crear una condición que compare si la variable numeroIf
    es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores,
    positivos.
 */
package openBootcamp.ejercicioEstructurasControl;

import javax.swing.*;

public class If {
    public static void main(String[] args) {
        int numeroIf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es positivo, negativo o cero"));
        if (numeroIf>0){
            System.out.println("El numero ingresado es positivo");
        }else if(numeroIf<0){
            System.out.println("El numero ingresado es negativo");
        }else {
            System.out.println("El numero ingresado es cero");
        }

    }
}
