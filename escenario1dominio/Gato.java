package escenario1dominio;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    private String raza;

    public String getRaza() {
        return raza;

    }
    public void setRaza(String raza) {
        this.raza = raza;

    }

    @Override
    public void hacerSonido(){
        System.out.println("Miau, miau..");
    }
}
