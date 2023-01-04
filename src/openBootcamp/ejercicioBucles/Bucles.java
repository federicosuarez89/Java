/*
    En este ejercicio tenéis que crear un bucle que permita concatenar textos
    e imprima el resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String.
 */
package openBootcamp.ejercicioBucles;

public class Bucles {
    public static void main(String[] args) {
        String [] nombres = {"Federico","Leandro","Yury"};
        for (int i=0;i<nombres.length;i++){
            System.out.println("Nombre de la persona: "+nombres[i]);
        }
    }
}
