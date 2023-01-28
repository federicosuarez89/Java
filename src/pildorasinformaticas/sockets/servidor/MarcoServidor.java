package pildorasinformaticas.sockets.servidor;

import javax.swing.*;
import java.awt.*;

public class MarcoServidor extends JFrame {
    private JTextArea areaTexto;

    public MarcoServidor(){
        setBounds(1200,300,280,350);
        JPanel miLamina = new JPanel();
        miLamina.setLayout(new BorderLayout());
        areaTexto = new JTextArea();
        miLamina.add(areaTexto,BorderLayout.CENTER);
        add(miLamina);
        setVisible(true);
    }
}
