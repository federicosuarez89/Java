package udemy.clase_object;

public class TestObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",5000);
        Empleado empleado2 = new Empleado("Juan",5000);

        //Comparamos la referencia en memoria de dos objetos si son iguales
        if (empleado1==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        //Comparamos si el contenido de dos objetos son iguales
        boolean comparacion = empleado1.equals(empleado2);
        if (comparacion){
            System.out.println("Los objetos son iguales en contenido");
        }else {
            System.out.println("Los objetos son distintos en contenido");
        }

        //Comparamos si el hash generado de cada objeto es igual
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Tienen el mismo hash code");
        }else {
            System.out.println("Tienen diferente hash code");
        }
    }
}
