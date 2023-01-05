package openbootcamp.poo;

public abstract class Vehiculo {
    //Atributos de clases
    private String fabricante;
    private String modeloVehiculo;
    private double cc;
    private int anho;
    private boolean sport;
    private int speed;
    Motor motor;

    //Constructores
    public Vehiculo(){
    }

    public Vehiculo(String fabricante, String modeloVehiculo, double cc, int anho, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.anho = anho;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
    }
    public Vehiculo(String fabricante,int anho){
        this.fabricante = fabricante;
        this.anho = anho;
    }

    //Metodos de clase
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    //Getter and setter
    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public double getCc() {
        return this.cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getAnho() {
        return this.anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public boolean isSport() {
        return this.sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    //toString()
}
