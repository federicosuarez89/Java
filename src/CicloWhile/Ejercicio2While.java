/*
Se genera un numero aleatorio entre 0-100 y el usuario debe adivinarlo
antes que se le acaben las oportunidades
 */
package CicloWhile;
import javax.swing.*;
public class Ejercicio2While {
    public static void main(String[] args) {
        int numAleatorio=(int)(Math.random()*100);
        int numUsuario=200;
        int acumulador=0;
        while (numAleatorio!=numUsuario){
            numUsuario= Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero entre 0 y 100"));
            if (numUsuario==numAleatorio){
                System.out.println(".......................................................");
                System.out.println("Has adivinado el numero secreto "+numUsuario);
                System.out.println(".......................................................");
            }else if (numUsuario>numAleatorio){
                System.out.println(".......................................................");
                System.out.println("El numero secreto es menor que "+numUsuario);
                System.out.println(".......................................................");
            }else {
                System.out.println(".......................................................");
                System.out.println("El numero secreto es mayor que "+numUsuario);
                System.out.println(".......................................................");
            }
            acumulador++;
            System.out.println("*****Llevas "+acumulador+" intentos*****");
            System.out.println(".......................................................");
        }
    }
}
