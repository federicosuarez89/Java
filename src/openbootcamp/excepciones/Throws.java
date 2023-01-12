package openbootcamp.excepciones;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try {
            leerNombres();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
    }

    /*
        Metodo que lee los nombres de la consola y verifica que tengan longitud
        igual o mayor que 8 caracteres
        @throws NameFormatException
     */
    private static void leerNombres() throws NameFormatException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (entrada.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = entrada.nextLine();
            if (nombre.length()<8){
                entrada.close();
                throw new NameFormatException("El nombre debe contener minimo 8 letras");
            }
        }
        entrada.close();
    }
}
