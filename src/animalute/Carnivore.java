package animalute;

public class Carnivore extends Animal {
    public Carnivore(String given_species_name, String nume) {
        species_name = given_species_name;
        animal_name = nume;
    }

    public void feed(Animal animal_to_be_eaten) {
        if (stomach_contents != null) {
            stomach_contents[number_of_feedings] = animal_to_be_eaten.animal_name;
        }
    }

    @Override
    public void make_speak() {
        System.out.println("\nHello I am a " + species_name);
    }
}