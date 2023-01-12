package pildorasinformaticas.graficos.dibujando;

import javax.swing.*;
import java.awt.*;

public class TableroFiguras extends JPanel {
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        //Dibujamos un rectangulo
        //g.drawRect(50,50,200,200);

        //Dibujamos una linea
        g.drawLine(100,100,300,200);
    }
}
