package pooPildorasInformaticas;

public class Auto {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoFinalAuto;
    private boolean asientosCuero;
    private boolean aireAcondicionado;
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
    //Creamos un getter que nos informe el color(devuelve valor)
    public String dimeColor(){
        return "El color del auto es: "+color;
    }


    //Creamos un setter para los asientos(no devuelve valor)
    public  void configuraAsientos(String asientosCuero){
        if (asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero = true;
        }else {
            this.asientosCuero = false;
        }
    }
    //Creamos un getter(devuelve valor)
    public String dimeAsientos(){
        if (asientosCuero == true){
            return "El auto tiene asientos de cuero";
        }else {
            return "El auto tiene asientos de pana";
        }
    }


    //Creamos un setter(no devuelve valor)
    public void configuraAireAcondicionado(String aireAcondicionado){
        if (aireAcondicionado.equalsIgnoreCase("si")){
            this.aireAcondicionado=true;
        }else {
            this.aireAcondicionado=false;
        }
    }
    //Creamos un getter(devuelve valor)
    public String dimeAireAcondicionado(){
        if (aireAcondicionado==true){
            return "El auto tiene calefaccion";
        }else {
            return "El auto tiene aire acondicionado";
        }
    }


    //Creamos un metodo getter y setter al mismo tiempo pero no es una buena practica
    //devuelve valor
    public String dimePesoAuto(){
        int pesoCarroceria=500;
        pesoFinalAuto=pesoPlataforma+pesoCarroceria;
        if (asientosCuero==true){
            pesoFinalAuto+=50;
        }
        if (aireAcondicionado==true){
            pesoFinalAuto+=20;
        }
        return "El peso del auto es: "+pesoFinalAuto;
    }


    //Creamos un getter(devuelve valor)
    public int precioAuto(){
        int precioFinal=10000;
        if (asientosCuero==true){
            precioFinal+=2000;
        }
        if (aireAcondicionado==true){
            precioFinal+=1500;
        }
        return precioFinal;
    }
}
