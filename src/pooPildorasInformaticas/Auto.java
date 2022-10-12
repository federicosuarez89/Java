package pooPildorasInformaticas;

public class Auto {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoFinalAuto;
    private boolean asientosCuero,aireAcondicionado;
    //Creamos el constructor de la clase(estado inicial)
    public Auto(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoPlataforma=500;
    }
    //Creamos un metodo getter,lo identificamos porque devuelve un valor
    public String dimeDatosGenerales(){
        return "La plataforma del auto tiene "+ruedas+" ruedas "+".Mide "+largo/1000+
                " metros con un ancho de "+ancho+" cm y un peso de plataforma de "+
                pesoPlataforma+" kg";
    }
    //Creamos un metodo setter,lo identificamos porque no retorna nada es vacio
    public void estableceColor(String colorAuto){
        color = colorAuto;
    }
    //Creamos un getter que nos informe el color
    public String dimeColor(){
        return "El color del auto es: "+color;
    }
    //Creamos un setter para los asientos
    public  void configuraAsientos(String asientosCuero){
        if (asientosCuero == "si"){
            this.asientosCuero = true;
        }else {
            this.asientosCuero = false;
        }
    }
    //Creamos un getter
    public String dimeAsientos(){
        if (asientosCuero == true){
            return "El auto tiene asientos de cuero";
        }else {
            return "El auto tiene asientos de pana";
        }
    }
}
