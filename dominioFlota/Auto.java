package dominioFlota;

public class Auto extends Vehiculo {

    private String motor;
    private String transmision;
    private String traccion;
    private int puertas;


    public Auto(String marca, int anio, String color, String motorizacion, String placa, Flota flota, String motor, String transmision, String traccion, int puertas) {
        super(marca, anio, color, motorizacion, placa, flota);
        this.motor = motor;
        this.transmision = transmision;
        this.traccion = traccion;
        this.puertas = puertas;

    }

    @Override
    public void mover() {
        System.out.println("El auto está acelerando.");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    
}
