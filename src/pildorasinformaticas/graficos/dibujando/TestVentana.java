package pildorasinformaticas.graficos.dibujando;
import java.awt.*;
import javax.swing.*;
public class TestVentana {
    public static void main(String[] args) {
        VentanaConDibujos miVentana = new VentanaConDibujos();

        //Hacemos visible la ventana
        miVentana.setVisible(true);

        //Damos comportamiento al programa luego de cerrar la ventana
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
