package escenario1dominio;

abstract public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public abstract void hacerSonido();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    
    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;

    }
    public int getEdad() {
        return edad;
    }
    




}
