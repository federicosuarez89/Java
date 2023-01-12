package pildorasinformaticas.graficos.marcos_centrados;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado extends JFrame {
    public MarcoCentrado(){
        //Detectamos la resolucion de nuestra pantalla
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanhoPantalla = miPantalla.getScreenSize();

        //almacenamos la altura de la pantalla
        int alturaPantalla = tamanhoPantalla.height;

        //almacenamos el ancho de la pantalla
        int anchoPantalla = tamanhoPantalla.width;

        //Damos como medida la mitad del total de la pantalla
        setSize(anchoPantalla/2, alturaPantalla/2);

        //Centramos la ventana
        setLocation(alturaPantalla/4, anchoPantalla/4);

        //Establecemos el titulo de la ventana
        setTitle("Ventana Fede");

        //Cambiamos el icono de la ventana
        Image miIcono = miPantalla.getImage("icono.gif");

        setIconImage(miIcono);

    }
}
