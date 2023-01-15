package pildorasinformaticas.streams.escribir_archivos;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {
    public void escribir(){
        String frase = "Prueba de escritura en archivo de texto";
        try {
            FileWriter escribiendoArchivo = new FileWriter("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\streams\\escribir_archivos\\archivoTexto.txt");
            //
            for (int i=0;i<frase.length();i++){
                escribiendoArchivo.write(frase.charAt(i));
            }
            escribiendoArchivo.close();

        } catch (IOException e) {
            System.out.println("----No se encontró el archivo----");
        }


    }
}
