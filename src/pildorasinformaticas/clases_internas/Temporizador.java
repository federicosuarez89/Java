/*
    -Una clase interna local es una clase que se encuentra dentro de un metodo
    -Son utiles cuando solo se va a utilizar(instanciar) la clase interna solo una vez.
    -Su objetivo es simplificar el codigo
    -Su ambito queda restringido al metodo donde son declaradas
    -Ventajas:
        --Estan muy encapsuladas,ni siquiera la clase a donde pertenecen puede acceder
        --Tan solo puede acceder a ella el metodo donde estan declaradas.
 */
package pildorasinformaticas.clases_internas;

import javax.swing.*;

public class Temporizador {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj(3000,true);
        miReloj.iniciarReloj();
        JOptionPane.showMessageDialog(null,"Detener programa");
        System.exit(0);
    }
}


