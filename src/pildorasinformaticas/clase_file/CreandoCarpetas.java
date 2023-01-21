package pildorasinformaticas.clase_file;

import java.io.File;
import java.io.IOException;

public class CreandoCarpetas {
    public static void main(String[] args) {
        //Instanciamos un objeto de tipo File y lo guardamos en la variable objeto ruta con la direccion en mi Pc donde se creara la carpeta
        File ruta = new File("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\clase_file\\Nueva Carpeta\\archivoNuevo.txt");

        //Creamos la nueva carpeta
        //ruta.mkdir();

        //Almacenamos en archivoDestino la ruta
        String archivoDestino = ruta.getAbsolutePath();

        //Creamos un nuevo archivo dentro de la carpeta creada
        try {
            ruta.createNewFile();
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo");
        }

        Escribir acceder = new Escribir();
        acceder.escribir(archivoDestino);

    }
}
