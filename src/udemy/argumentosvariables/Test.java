package udemy.argumentosvariables;

public class Test {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        parametros("Federico",2,3,4,6,7,8,9,11);

    }
    private static void parametros(String nombre,int... numeros){
        System.out.println("\n----Metodo parametros()----");
        System.out.println("Nombre:"+nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int... numeros){
        System.out.println("\n----Metodo imprimirNumeros()----");
        for (int i=0;i< numeros.length;i++){
            System.out.println("Elemento: "+numeros[i]);
        }
    }
}
