package udemy.autoboxing_unboxing;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        /*
            Clases envolventes o Wrapper de tipos primitivos
            int-Integer
            long-Long
            float-Float
            double-Double
            boolean-Boolean
            byte-Byte
            char-Character
            short-Short
         */
        
        //es un tipo primitivo
        int entero = 10;
        System.out.println("entero = " + entero);
        
        //es un tipo object
        Integer entero1 = 11;
        System.out.println("entero1 = " + entero1.toString());
    }
}
