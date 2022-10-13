package pooPildorasInformaticas;

import javax.swing.*;

public class Uso_Auto {
    public static void main(String[] args) {
        Auto Renault=new Auto(); //Instanciamos una clase
        //Renault es un ejemplar de la clase Auto
        System.out.println(Renault.dimeDatosGenerales());

        //Establecemos el color y lo mandamos a imprimir
        Renault.estableceColor(JOptionPane.showInputDialog("Introduce el color del auto"));
        System.out.println(Renault.dimeColor());

        //Establecemos si tiene asientos de cuero y mandamos a imprimir
        Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(Renault.dimeAsientos());

        //Establecemos si tiene aire acondicionado y mandamos a imprimir
        Renault.configuraAireAcondicionado(JOptionPane.showInputDialog("¿Tiene aire acondicionado?"));
        System.out.println(Renault.dimeAireAcondicionado());

        //Como este metodo unifica setter y getter solo se llama de esta manera
        System.out.println(Renault.dimePesoAuto());

        //Pedimos el precio del auto
        System.out.println("EL precio final del auto es: "+Renault.precioAuto());


    }
}
