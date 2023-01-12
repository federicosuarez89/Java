package pildorasinformaticas.graficos.escribiendo_marcos;

import javax.swing.*;

public class MarcoConTexto extends JFrame {
    public MarcoConTexto(){
        //Hacemos visible la ventana
        setVisible(true);

        //Damos el tamaño a la ventana
        setSize(600,450);

        //Damos ubicacion en el eje x e y
        setLocation(400,200);

        //Definimos el titulo
        setTitle("Mi ventana");

        //Instanciamos un objeto de tipo Tablero
        Tablero miTablero = new Tablero();
        //Agregamos el tablero a la ventana
        add(miTablero);
    }
}
