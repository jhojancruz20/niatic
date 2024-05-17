
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Granja {
    public static void main(String[] args) {
        // Crear una instancia de la Granja
        Granja granja = new Granja();

        Date fechaNacimientoG1 = new Date(2019 - 1900, Calendar.JANUARY, 1);
        Date fechaNacimientoV1 = new Date(2017 - 1900, Calendar.APRIL, 15);
        Date fechaNacimientoC1 = new Date(2020 - 1900, Calendar.DECEMBER, 10);
        Date fechaNacimientoG2 = new Date(2023 - 1900, Calendar.MAY, 20);

        Animal gallina1 = new Gallina("G1", "Gallinita", 2.5, fechaNacimientoG1);
        Animal vaca1 = new Vaca("V1", "Vaquita", 350, fechaNacimientoV1);
        Animal cerdo1 = new Cerdo("C1", "Cerdito", 120, fechaNacimientoC1);
        Animal gallina2 = new Gallina("G2", "Pollito", 1.2, fechaNacimientoG2);

        // Registrar los animales en la granja
        granja.registrarAnimal(gallina1);
        granja.registrarAnimal(vaca1);
        granja.registrarAnimal(cerdo1);
        granja.registrarAnimal(gallina2);

        // Mostrar la cantidad de animales por tipo
        granja.mostrarCantidadPorTipo();
    }

    // ArrayList para almacenar los animales de la granja
    private ArrayList<Animal> animales;
    // El construcotr
    public Granja() {
        animales = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarCantidadPorTipo() {
        int gallinas = 0;
        int vacas = 0;
        int cerdos = 0;

        for (Animal animal : animales) {
            if (animal instanceof Gallina) {
                gallinas++;
            } else if (animal instanceof Vaca) {
                vacas++;
            } else if (animal instanceof Cerdo) {
                cerdos++;
            }
        }

        System.out.println("Cantidad de animales en la granja:");
        System.out.println("Gallinas: " + gallinas);
        System.out.println("Vacas: " + vacas);
        System.out.println("Cerdos: " + cerdos);
    }
}
