package udemy.enumeracion;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("Continente n°4: "+Continentes.AMERICA);
        System.out.println("Paises en el continente: "+Continentes.AMERICA.getPaises());
        System.out.println("Personas en el continente: "+Continentes.AMERICA.getHabitantes());
    }
    private static void indicarDiaDeLaSemana(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("1");
                break;
            case MARTES:
                System.out.println("2");
                break;
            case MIERCOLES:
                System.out.println("3");
                break;
            case JUEVES:
                System.out.println("4");
                break;
            case VIERNES:
                System.out.println("5");
                break;
            case SABADO:
                System.out.println("6");
                break;
            case DOMINGO:
                System.out.println("7");
                break;
        }
    }
}
