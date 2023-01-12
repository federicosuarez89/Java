package pildorasinformaticas.graficos.dibujando;

import javax.swing.*;

public class VentanaConDibujos extends JFrame {
    public VentanaConDibujos(){
        //Editamos el titulo de la ventana
        setTitle("Mi ventana");

        //Establecemos el tamanho de la ventana
        setSize(400,400);

        //Agregamos el tablero
        TableroFiguras miTablero = new TableroFiguras();
        add(miTablero);

    }
}
