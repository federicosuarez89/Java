package pildorasinformaticas.clase_file;

import java.io.File;

public class Eliminar {
    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\clase_file\\Nueva Carpeta\\archivoNuevo.txt");

        //Con esta instruccion eliminamos el archivo indicado en la ruta
        ruta.delete();
    }

}
