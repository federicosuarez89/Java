package udemy.manejo_archivos;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\udemy\\manejo_archivos\\prueba.txt";
        //ManejoArchivos.crearArchivo(nombreArchivo);
        //ManejoArchivos.escribirArchivo(nombreArchivo,"Hola estamos escribiendo desde Java");
        //ManejoArchivos.agregarInformacion(nombreArchivo,"Estamos agregando mas informacion");
        ManejoArchivos.leerArchivo(nombreArchivo);
    }
}
