package pildorasinformaticas.streams;

import udemy.overriding.SobreescrituraMetodos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {
    public void lee(){
        try {
            //Instanciamos para guardar la ruta del archivo a leer en una variable
            FileReader entrada = new FileReader("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\streams\\archivoTexto.txt");

            //Guardamos la lectura del archivo en una variable en unicode
            int lectura = entrada.read();
            while (lectura!=-1){
                lectura = entrada.read();
                //Cambiamos el valor unicode por char
                char letra = (char)lectura;
                System.out.print(letra);
            }

        } catch (IOException e) {
            System.out.println("----No se ha encontrado el archivo----");
        }

    }
}
