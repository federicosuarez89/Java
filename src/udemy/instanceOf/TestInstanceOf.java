package udemy.instanceOf;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",5000);
        //getTipo(empleado);

        empleado = new Gerente("Karla",10000,"Contabilidad");
        getTipo(empleado);
    }

    /*
        Con instanceOf estamos preguntando si la variable empleado esta apuntando a un
        objeto de tipo Gerente
     */
    public static void getTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente.getDepartamento() = " + gerente.getDepartamento());

        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
