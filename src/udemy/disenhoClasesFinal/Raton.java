package udemy.disenhoClasesFinal;

public class Raton extends DispositivoEntrada{
    //Atributos de clase
    private final int idRaton;
    private static int contadorRatones;

    //Constructor de la clase
    public Raton(String tipoEntrada,String marca){
        super(tipoEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    //toString()


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----Raton----");
        sb.append("\nidRaton:").append(idRaton);
        return super.toString()+sb.toString();
    }
}
