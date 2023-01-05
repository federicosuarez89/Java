package ciclowhile;

import javax.swing.*;

public class Ejercicio1While {
    public static void main(String[] args) {
        String mail= JOptionPane.showInputDialog("Ingrese su mail: ");
        String mail2=JOptionPane.showInputDialog("Reingrese su mail: ");
        while (mail2.equals(mail)==false){
            mail2=JOptionPane.showInputDialog("El mail ingresado no es valido, verifique: ");
        }
        System.out.println("El mail ingresado es valido");
    }
    }

