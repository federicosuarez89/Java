package udemy.palabraReturn;

public class Suma {
    int a;
    int b;
    public Suma(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int sumar(){
        return this.a + this.b;
    }
    public static Suma creObjetoSuma(){
        Suma sumando = new Suma(4,6);
        return sumando;
    }
}
