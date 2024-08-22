package escenario1dominio;

import java.util.List;
import java.util.ArrayList;

public class ZoologicoSaenzPena implements ZoologicoInterface {
    private List<Animal> animales = new ArrayList<>();

    public ZoologicoSaenzPena(List<Animal> animales) {
        this.animales = animales;

    }

    @Override
    public void hacerSonidoAnimal() {
        System.out.println("Zoologico Saenz Peña")


        for (Animal animal : animales) {
            System.out.println("Animal: ");
            animal.hacerSonido();
        }
    }
}
