package pildorasinformaticas.sockets.cliente;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.Socket;

public class LaminaMarcoCliente extends JPanel {
    private JTextField campo1;
    private JButton miBoton;

    public LaminaMarcoCliente(){
        JLabel texto = new JLabel("CLIENTE");
        add(texto);
        campo1 = new JTextField(20);
        add(campo1);
        miBoton = new JButton("Enviar");
        EnviaTexto miEvento = new EnviaTexto();
        miBoton.addActionListener(miEvento);
        add(miBoton);
    }
    private class EnviaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Socket miSocket = new Socket("192.168.1.45", 9999);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


