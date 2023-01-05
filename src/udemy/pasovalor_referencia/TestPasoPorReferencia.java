package udemy.pasovalor_referencia;

public class TestPasoPorReferencia {

    //Creamos un metodo setter
    private static void setPerson(PasoPorReferencia personArg){
        personArg.setName("Carlos");
    }
    public static void main(String[] args) {
        PasoPorReferencia persona1 = new PasoPorReferencia();
        persona1.setName("Juan");
        System.out.println("Valor nombre: "+persona1.getName());
        System.out.println("**********************");
        System.out.println("Luego de cambiar la variable pasando datos por referencia");
        setPerson(persona1);
        System.out.println("Valor nombre: "+persona1.getName());
    }
}
