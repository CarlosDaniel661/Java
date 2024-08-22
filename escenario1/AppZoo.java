package escenario1;

import escenario1dominio.Animal;
import escenario1dominio.Perro;
import escenario1dominio.Gato;
import escenario1dominio.Zoologico;
import escenario1dominio.ZoologicoInterface;
import escenario1dominio.ZoologicoSaenzPena;

import java.util.ArrayList;
import java.util.List;


public class AppZoo {
    public static void main(String[] args) {
        List<ZoologicoInterface> listaZoologico = new ArrayList<ZoologicoInterface>();
        
        
        
        Perro perro = new Perro("Titino" , 4);
        Perro perro2 = new Perro("Tete", 1);
        Gato gato = new Gato("Greys", 3, "Calle");

        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(perro2);
        animales.add(gato);

        Zoologico zoologico = new Zoologico(animales);


        

        Perro perroSP = new Perro("TitinoSP" , 4);
        Perro perro2SP = new Perro("TeteSP", 1);
        Gato gatoSP = new Gato("GreysSP", 3, "Calle");

        List<Animal> animalesSP = new ArrayList<>();
        animalesSP.add(perroSP);
        animalesSP.add(perro2SP);
        animalesSP.add(gatoSP);

        ZoologicoSaenzPena zoologicoSaenzPena = new ZoologicoSaenzPena(animalesSP);

        listaZoologico.add(zoologico);
        listaZoologico.add(zoologicoSaenzPena);


        for (ZoologicoInterface zoo : listaZoologico) {
            zoo.hacerSonidoAnimal();
        }
    }
}
