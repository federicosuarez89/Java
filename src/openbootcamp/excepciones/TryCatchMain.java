package openbootcamp.excepciones;

public class TryCatchMain {
    public static void main(String[] args) {
        try {
            int result = 5/0;
        }catch (ArithmeticException e){
            //Imprimimos el error para saber que ha ocurrido
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");
    }
}
