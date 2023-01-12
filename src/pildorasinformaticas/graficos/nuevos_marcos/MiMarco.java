package pildorasinformaticas.graficos.nuevos_marcos;

import javax.swing.*;

public class MiMarco extends JFrame {
    public MiMarco(){
        //Solo establece el tamanho de la ventana
        //setSize(500,300);

        //Solo establece la ubicacion de la ventana
        //setLocation(500,300);

        //Establece posicion y tamanho de la ventana
        setBounds(500,300,550,250);

        //prohibe cambiar el tamanho de la ventana
        //setResizable(false);

        //permite extender la ventana a pantalla completa
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Ponemos titulo a la ventana
        setTitle("Ventana Fede");
    }

}
