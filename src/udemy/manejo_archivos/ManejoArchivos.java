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

    public static void escribirArchivo(String nombreArchivo,String texto){
        //Instanciamos un objeto de tipo File
        File archivo = new File(nombreArchivo);

        //Creamos la excepcion por si no se encuentra el archivo a escribir
        try {
            //Creamos el archivo
            PrintWriter salida = new PrintWriter(archivo);
            //Escribimos en el archivo
            salida.println(texto);
            //Cerramos
            salida.close();
            System.out.println("Se ha escrito exitosamente nuestro archivo .txt");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo para escribir");
        }
    }

    public static void agregarInformacion(String nombreArchivo,String texto){
        //Instanciamos un objeto de tipo File
        File archivo = new File(nombreArchivo);

        //Creamos la excepcion por si no se encuentra el archivo a escribir
        try {
            //Creamos el archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            //Escribimos en el archivo
            salida.println(texto);
            //Cerramos
            salida.close();
            System.out.println("Se ha escrito exitosamente nuestro archivo .txt");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo para escribir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
