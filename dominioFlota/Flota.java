package dominioFlota;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos = new ArrayList<>(); //Lista de vehiculos de la flota
    private String tipo; // Tipos de vehículos que conforman la flota
    private String funcion; // Función de la flota

    public Flota(List<Vehiculo> vehiculos, String tipo, String funcion) {
        this.vehiculos = vehiculos;
        this.tipo = tipo;
        this.funcion = funcion;

    }

    public void moverEnFlota() {
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.mover();
        }
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    


}
