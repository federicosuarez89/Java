package udemy.pasoValorYReferencia;

public class PasoPorValor {
    //Creamos un setter para cambiar el valor de la variable
    public static void cambiarValor(int arg){
        arg=200;
    }
    //Creamos un setter para imprimir el valor de la variable
    public static void imprimir(int x){
        System.out.println("Valor de la variable: "+x);
    }

    public static void main(String[] args) {
        int x=10;
        System.out.println("Valor original de la variable");
        imprimir(x);
        System.out.println("****************************");
        System.out.println("Valor de la variable luego de tratar de modificarla con paso por valor");
        cambiarValor(x);
        imprimir(x);
    }
}
