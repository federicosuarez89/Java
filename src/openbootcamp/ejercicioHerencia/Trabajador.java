package openbootcamp.ejercicioHerencia;

public class Trabajador extends Persona{
    //Atributos de clase
    private int salario;

    //Constructor de la clase
    public Trabajador(String nombre, int edad,int telefono){
        super(nombre, edad, telefono);
    }

    //getter y setter
    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Metodo toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n--Trabajador--");
        sb.append("\nsalario:").append(salario);
        return super.toString()+sb.toString();
    }
}
