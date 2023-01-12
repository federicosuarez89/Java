package pildorasinformaticas.graficos.escribiendo_marcos;

import javax.swing.*;

public class TestMarco {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();

        //Comportamiento del programa cuando se cierra la ventana
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
