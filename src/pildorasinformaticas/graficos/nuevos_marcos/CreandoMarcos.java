package pildorasinformaticas.graficos.nuevos_marcos;

import pildorasinformaticas.graficos.nuevos_marcos.MiMarco;

import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();

        //Hacemos visible la ventana
        marco1.setVisible(true);
        //Indicamos que hace nuestro marco cuando la ventana se cierra
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
