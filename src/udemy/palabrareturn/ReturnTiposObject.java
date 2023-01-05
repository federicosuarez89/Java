package udemy.palabrareturn;

public class ReturnTiposObject {
    public static void main(String[] args) {
        Suma nuevaSuma1 = Suma.creObjetoSuma();
        System.out.println("Resultado de llamar el metodo sumar: "+
                nuevaSuma1.sumar());
    }
}
