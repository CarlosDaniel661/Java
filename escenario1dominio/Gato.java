package escenario1dominio;

public class Gato extends Animal {

    private String raza;
    
    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }   
    

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
