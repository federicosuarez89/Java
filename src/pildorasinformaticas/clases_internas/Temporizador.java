package pildorasinformaticas.clases_internas;

import javax.swing.*;

public class Temporizador {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj(3000,true);
        miReloj.iniciarReloj();
        JOptionPane.showMessageDialog(null,"Detener programa");
        System.exit(0);
    }
}


