package udemy.palabraReturn;


public class ReturnTiposPrimitivos {
    public static void main(String[] args) {
        setSumarValoresSinRetorno(3,6);
        int resultado = getSumarConRetorno(4,2);
        System.out.println(resultado);
    }

    private static int getSumarConRetorno(int a,int b){
        return a+b;
    }


    private static void setSumarValoresSinRetorno(int a, int b) {
        System.out.println("La suma sin retornar valor es: "+(a+b));
    }
}
