package dominioFlota;
abstract public class Vehiculo {

    protected String marca;
    protected int anio;
    protected String color;
    protected String motorizacion;
    protected String placa;
    protected Flota flota;

    public Vehiculo(String marca, int anio, String color, String motorizacion, String placa, Flota flota) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.motorizacion = motorizacion;
        this.placa = placa;
        this.flota = flota;

    }

    public abstract void mover();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotorizacion() {
        return motorizacion;
    }

    public void setMotorizacion(String motorizacion) {
        this.motorizacion = motorizacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    
}