package pildorasinformaticas.temporizador;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class DameHora implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Hora cada 5 segundos: "+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}
