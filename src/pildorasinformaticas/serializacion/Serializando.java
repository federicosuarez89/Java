package pildorasinformaticas.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializando {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Juan",80000,2005,12,15);
        jefe.setIncentivo(5000);

        Empleado [] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana",25000,2008,10,1);
        personal[2] = new Empleado("Luis",18000,2012,9,15);

        try {
            //Escribimos el objeto en un medio de almacenamiento externo
            ObjectOutputStream escribiendoArchivo = new ObjectOutputStream(new FileOutputStream("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\serializacion\\empleado.dat"));
            escribiendoArchivo.writeObject(personal);
            escribiendoArchivo.close();

            //Recuperamos los datos de ese archivo y los recorremos con un bucle for
            ObjectInputStream leyendoArchivo = new ObjectInputStream(new FileInputStream("C:\\Users\\feder\\Desktop\\Federico\\Ejercicios Java\\src\\pildorasinformaticas\\serializacion\\empleado.dat"));
            Empleado [] personalRecuperado = (Empleado[]) leyendoArchivo.readObject();
            leyendoArchivo.close();
            for (Empleado e:personalRecuperado) {
                System.out.println(e);
            }
        }catch (Exception e){

        }
    }
}
