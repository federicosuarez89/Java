package pildorasinformaticas.programacion_generica.herencia_tiposComodin;

public class HerenciaGenericos {
    public static void main(String[] args) {
        /*
            Empleado Administrativa = new Empleado("Elena",45,1500);
            Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
            Empleado nuevoEmpleado = DirectoraComercial;
         */
        Pareja<Empleado> Adminstrativa = new Pareja<>();
        Pareja<Jefe> DirectoraComercial = new Pareja<>();
        //Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
        Pareja.getTrabajador(Adminstrativa);
        Pareja.getTrabajador(DirectoraComercial);


    }
}
