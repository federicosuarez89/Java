package udemy.excepciones;

public class TestExcepciones1 {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error de tipo Exception");

            //Se imprime pila de excepciones
            e.printStackTrace();
            //Imprimimos el mensaje de la excepcion creada
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Se reviso la division entre cero");
        }
    }
}
