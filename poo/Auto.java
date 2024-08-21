package poo;

public class Auto {

    private String marca;
    private int cantidadDePuertas;
    private String modelo;
    private String color;
    private String placa;

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCantidadDePuertas(int cantidadDePuertas){
        this.cantidadDePuertas = cantidadDePuertas;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }


    public String getMarca(){
        return marca;
    }
    public int getCantidadDePuertas(){
        return cantidadDePuertas;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public String getPlaca(){
        return placa;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + " Modelo: " + modelo + " Color: " + color + " Placa: " + placa;
        
    }



}
