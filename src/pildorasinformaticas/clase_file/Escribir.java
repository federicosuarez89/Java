package pildorasinformaticas.clase_file;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

        //Metodo que me permite escribir dentro de un archivo especificado dentro de la ruta que se guarda en la variable rutaArchivo,
          public void escribir(String rutaArchivo){

            String frase = "Esto es un ejemplo";
            try{
                //Se instancia un objeto de tipo FileWriter para guardar la ruta del archivo en la variable escritura para escribir en el archivo
                FileWriter escritura = new FileWriter(rutaArchivo);

                //Recorremos el String dentro de la variable frase caracter a caracter y lo agregamos al archivo especificado
                for (int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
                }

                //Cerramos el proceso
                escritura.close();
            }catch (IOException e){}
          }



}
