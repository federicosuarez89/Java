package arrays;

import javax.swing.*;

public class UsoArrays2 {
    public static void main(String[] args) {
        /*
        pasies[0]="España";
        pasies[1]="Mexico";
        pasies[2]="Colombia";
        pasies[3]="Peru";
        pasies[4]="Chile";
        pasies[5]="Argentina";
        pasies[6]="Ecuador";
        pasies[7]="Venezuela";
        */
        //Recorremos la matriz con un bucle for tradicional
        /*
        for (int i=0;i<pasies.length;i++){
            System.out.println("Pais "+(i+1)+" "+pasies[i]);
        }*/
        //String [] pasies={"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
        String [] pasies=new String[8];
        //LLenamos la matriz con un bucle for
        for (int i=0;i< pasies.length;i++){
            pasies[i]= JOptionPane.showInputDialog("Introduce pais: "+(i+1));
        }
        //Recorremos la matriz con un bucle for each
        for (String i:pasies) {
            System.out.println("Pais: "+i);
        }
    }
}
