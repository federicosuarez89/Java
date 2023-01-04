package openBootcamp.poo;

public class Motor {
    //Atributos de clase
    private String modeloMotor;
    private int potencia;
    private double torque;
    private int cilindros;

    //Constructores
    public Motor(){}

    public Motor(String modeloMotor, int potencia, double torque, int cilindros) {
        this.modeloMotor = modeloMotor;
        this.potencia = potencia;
        this.torque = torque;
        this.cilindros = cilindros;
    }
    //Metodos
}
