package udemy.overriding;

public class HijaOverriding extends SobreescrituraMetodos{
    private String departamento;

    public HijaOverriding(String nombre,double sueldo,String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    @Override
    public String getDetalles() {
        return super.getDetalles()+"\nDepartamento: "+this.departamento;
    }
}
