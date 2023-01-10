package pildorasinformaticas.temporizador;

import javax.swing.*;

public class Temporizador {
    public static void main(String[] args) {
        DameHora oyente = new DameHora();
        Timer miTemporizador = new Timer(5000,oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Aceptar para detener el programa");
        System.exit(0);
    }
}
