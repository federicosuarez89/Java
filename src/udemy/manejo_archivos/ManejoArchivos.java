package udemy.manejo_archivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        //Instanciamos un objeto de tipo File
        File archivo = new File(nombreArchivo);

        //Creamos la excepcion por si no se crea el archivo
        try {
            //Creamos el archivo
            PrintWriter salida = new PrintWriter(archivo);
            //Cerramos
            salida.close();
            System.out.println("Se ha generado exitosamente el archivo .txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
