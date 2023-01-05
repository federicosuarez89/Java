package udemy.poo.sobrecargametodos;

public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("Ejecutando sumar con argumentos enteros");
        return a+b;
    }
    //Sobrecarga del metodo sumar
    public static double sumar(double a, double b){
        System.out.println("Ejecutando sumar con argumentos flotantes");
        return a + b;
    }
}
