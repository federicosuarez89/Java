package pildorasinformaticas.pooempleados.abstraccion;

public class Main {
    public static void main(String[] args) {
        Persona [] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado("Luis Conde",50000,2009,02,25);
        lasPersonas[1] = new Alumno("Ana Lopez","Biologia");

        for (Persona p:lasPersonas) {
            System.out.println(p.getNombre()+","+p.getDescripcion());

        }
    }
}
