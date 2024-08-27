package dominioFlota;

public class Camioneta extends Vehiculo {
    
    private String motorCamioneta;
    private String traccionCamioneta;
    private String cabina;

    public Camioneta(String marca, int anio, String color, String motorizacion, String transmision, String placa, Flota flota, String motorCamioneta, String traccionCamioneta, String cabina) {
        super(marca, anio, color, motorizacion, transmision, placa, flota);
        this.motorCamioneta = motorCamioneta;
        this.transmision = transmision;
        this.traccionCamioneta = traccionCamioneta;
        this.cabina = cabina;
    }

    @Override
    public void mover() {
        System.out.println("La camioneta está acelerando. ");
    }

    public String getMotorCamioneta() {
        return motorCamioneta;
    }

    public void setMotorCamioneta(String motorCamioneta) {
        this.motorCamioneta = motorCamioneta;
    }

    public String getTraccionCamioneta() {
        return traccionCamioneta;
    }

    public void setTraccionCamioneta(String traccionCamioneta) {
        this.traccionCamioneta = traccionCamioneta;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    

}
