package udemy.disenhoclasesfinal;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada,String marca ){
        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n----Teclado----");
        sb.append("\nidTeclado:").append(idTeclado);
        return super.toString()+sb.toString();
    }
}
