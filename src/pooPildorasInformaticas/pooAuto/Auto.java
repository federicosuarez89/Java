package pooPildorasInformaticas.pooAuto;

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
        String imprimeRuedas = "El auto tiene "+ruedas+" ruedas";
        String imprimeLargo= "Mide "+largo/1000+" metros";
        String imprimeAncho = " Tiene un ancho de "+ancho+" cm";
        String imprimePesoPlataforma= "Tiene un peso de plataforma de "+pesoPlataforma+" kg";
        String resultado = imprimeRuedas + imprimeLargo + imprimeAncho + imprimePesoPlataforma;
        return resultado;
    }


    //Creamos un metodo setter,lo identificamos porque no retorna nada es vacio
    public void estableceColor(String colorAuto){
        color = colorAuto;
    }
    //Creamos un getter que nos informe el color(devuelve valor)
    public String dimeColor(){
        String imprimeColor = "El color del auto es: "+color;
        return imprimeColor;
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
            String imprimeAsientosCuero = "El auto tiene asientos de cuero";
            return imprimeAsientosCuero;
        }else {
            String imprimeAsientosPana = "El auto tiene asientos de pana";
            return imprimeAsientosPana;
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
            String imprimeCalefaccion = "El auto tiene calefaccion";
            return imprimeCalefaccion;
        }else {
            String imprimeAC = "El auto tiene aire acondicionado";
            return imprimeAC;
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
