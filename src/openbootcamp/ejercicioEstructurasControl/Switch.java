/*
    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
    cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
    un mensaje por consola informando de la estación en la que está. También habrá que poner
    un default para cuando el valor de la variable no sea una estación.
 */
package openbootcamp.ejercicioEstructurasControl;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        int estacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una mes del año"));
        switch (estacion){
            case 1: case 2: case 3:
                System.out.println("Verano en Argentina");
                break;
            case 4: case 5: case 6:
                System.out.println("Otoño en Argentina");
                break;
            case 7: case 8: case 9:
                System.out.println("Invierno en Argentina");
                break;
            case 10: case 11: case 12:
                System.out.println("Primavera en Argentina");
                break;
            default:
                System.out.println("La variable ingresada no es una estacion");
        }
    }
}
