package pildorasinformaticas.graficos.escribiendo_marcos;

import javax.swing.*;
import java.awt.*;

public class Tablero extends JPanel {
    public void paintComponent(Graphics g){
        //Llamamos al metodo de la clase padre
        super.paintComponent(g);
        //Escribimos sobre el tablero creado
        g.drawString("Estamos aprendiendo swing",100,100);
    }
}
