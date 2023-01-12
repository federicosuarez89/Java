package pildorasinformaticas.graficos.marcos_centrados;

import javax.swing.*;

public class TestMarcosCentrados {
    public static void main(String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();

        //Damos comportamiento al programa al cerrar la ventana
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Hacemos visible la ventana
        miMarco.setVisible(true);

    }
}
