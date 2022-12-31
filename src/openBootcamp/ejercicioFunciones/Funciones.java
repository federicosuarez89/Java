/*
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores
 */
package openBootcamp.ejercicioFunciones;

public class Funciones {
    public static void main(String[] args) {
        sumar(1,2,3);
    }
    public static void sumar(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println("El resultado de la suma es: "+resultado);
    }

}
