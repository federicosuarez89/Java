package pildorasinformaticas.clase_file;

import java.io.File;

public class RutasArchivos {
    public static void main(String[] args) {
        //Instanciamos un objeto de tipo File
        File archivo = new File("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\clase_file\\ejemplo_archivo.txt");

        //Imprimimos la ruta absoluta del archivo
        System.out.println(archivo.getAbsolutePath());

        //Verificamos si el archivo existe
        System.out.println(archivo.exists());



    }
}
