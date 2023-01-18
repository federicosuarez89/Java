package pildorasinformaticas.serializacion;

public class Administrador extends Empleado{
    private double incentivo;
    public Administrador(String nombre,double sueldo, int anho,int mes,int dia){
        super(nombre, sueldo, anho, mes, dia);
        incentivo = 0;
    }

    @Override
    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }

    public void setIncentivo(double b){
        incentivo = b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Administrador{");
        sb.append("incentivo:").append(incentivo);
        sb.append('}');
        return sb.toString();
    }
}
