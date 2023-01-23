package udemy.programacion_generica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.getTipo();

        ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Juan");
        objetoStr.getTipo();
    }
}
