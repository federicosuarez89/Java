package pildorasinformaticas.clases_internas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {
    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo,boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void iniciarReloj(){
        ActionListener listener = new GetTime();
        Timer miTimer = new Timer(intervalo,listener);
        miTimer.start();
    }

    //Creamos una clase interna
    private class GetTime implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("Hora cada 3 segundos: "+ahora);
            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
