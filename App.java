import poo.Auto;
import poo.Persona;

public class App {
    public static void main(String[] args) {

        //Para Instanciar:
        // 1. Tipo de dato -> Clase Persona
        // 2. variable para guardar el objeto -> persona
        // 3. Instanciar objeto con new NombreDeClase()

        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setApellido("Jiménez");
        persona.setEdad(32);
        persona.setDni(12345678);

        Auto auto = new Auto();
        auto.setColor("Azul");
        auto.setMarca("Alfa Romeo");
        auto.setModelo("145 TD");
        auto.setPlaca("CZY 307");
        auto.setCantidadDePuertas(5);

        persona.setAuto(auto);


        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());
        System.out.println(persona.getAuto().toString());

        Persona persona2 = new Persona("Oki", "Sosa Ortiz", 33, 12345678);
    }
}
