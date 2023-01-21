package pildorasinformaticas.clase_file;

import java.io.File;

public class AccesoArchivos {
    public static void main(String[] args) {
        //Instanciamos un objeto de tipo File y le indicamos la ruta con la que va a trabajar
        File ruta = new File("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\graficos");

        //Guardamos los nombres de los archivos de la carpeta en un array
        String [] nombresArchivos = ruta.list();

        //Recorremos el array e imprimimos los archivos o carpetas del directorio
        for (int i=0;i<nombresArchivos.length;i++){
            System.out.println(nombresArchivos[i]);
            /*
                Instanciamos otro objeto de tipo File y almacenamos en la variable objeto f
                la ruta y guardamos en el array los archivos que hay dentro
             */
            File f = new File(ruta.getAbsolutePath(),nombresArchivos[i]);

            //Comprobamos si f es una carpeta y ver los archivos que hay dentro
            if (f.isDirectory()){

                //Guardamos los archivos y el nombre de la carpeta en un array
                String [] arcivoSubcarpeta = f.list();

                //Recorremos e imprimimos el array para ver que hay dentro
                for (int j=0;j<arcivoSubcarpeta.length;j++){
                    System.out.println(arcivoSubcarpeta[j]);
                }
            }
        }




    }
}
