package udemy.pasoValorYReferencia;

public class PasoPorValor {
    public static void cambiarValor(int i){
        i=200;
    }
    public static void imprimir(int x){
        System.out.println("Valor de la variable: "+x);
    }
    public static void main(String[] args) {
        int x=10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }
}
