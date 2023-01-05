/*
    Para este ejercicio tendréis que crear una función que reciba un precio
    y devuelva el precio con el IVA incluido.
 */
package openbootcamp.ejercicioFuncionesIva;

import javax.swing.*;

public class FuncionesIva {
    public static void main(String[] args) {
        System.out.println("El precio mas el iva es: "+funcionIva());
    }
    public static float funcionIva(){
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio para sumarle el iva"));
        float iva = 1.21F;
        float resultado = precio * iva;
        return resultado;
    }
}
