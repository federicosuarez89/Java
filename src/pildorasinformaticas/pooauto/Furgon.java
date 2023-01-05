package pildorasinformaticas.pooauto;

public class Furgon extends Auto{
    //Creamos las variables de clase
    private int capacidadExtraFurgon;
    private int asientosExtras;


    //Declaramos el constructor de la clase
    public Furgon(int asientosExtras,int capacidadExtraFurgon){
        //Llama al constructor de la clase padre Auto
        super();
        this.asientosExtras = asientosExtras;
        this.capacidadExtraFurgon = capacidadExtraFurgon;
     }

     //Creamos un getter para obtener los datos del furgon
     public String getDataFurgon(){
        String messageCapacity = "La capacidad de carga es: "+capacidadExtraFurgon;
        String menssageSeating = "\nLa cantidad de asientos es: "+asientosExtras;
        return messageCapacity+menssageSeating;
     }
}
