package pildorasInformaticas.pooAuto;

public class UsoVehiculo {
    public static void main(String[] args) {
        Auto myCar1 = new Auto();
        myCar1.estableceColor("Rojo");

        Furgon myFurgon1 = new Furgon(7,580);
        myFurgon1.estableceColor("Azul");
        myFurgon1.configuraAireAcondicionado("si");
        myFurgon1.configuraAsientos("si");
        System.out.println("---DATOS DEL AUTO CREADO---");
        System.out.println(myCar1.dimeDatosGenerales());
        System.out.println(myCar1.dimeColor());
        System.out.println("****************************\n");
        System.out.println("---DATOS DEL FURGON CREADO---");
        System.out.println(myFurgon1.dimeDatosGenerales());
        System.out.println(myFurgon1.dimeColor());
        System.out.println(myFurgon1.getDataFurgon());
    }
}
