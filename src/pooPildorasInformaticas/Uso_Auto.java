package pooPildorasInformaticas;

public class Uso_Auto {
    public static void main(String[] args) {
        Auto Renault=new Auto(); //Instanciamos una clase
        //Renault es un ejemplar de la clase Auto
        System.out.println(Renault.dimeDatosGenerales());

        Renault.estableceColor("Rojo");
        System.out.println(Renault.dimeColor());

        Renault.configuraAsientos("si");
        System.out.println(Renault.dimeAsientos());


    }
}
