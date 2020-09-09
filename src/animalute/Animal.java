package animalute;

class Animal {
    String species_name;
    String[] stomach_contents = new String[30];
    String animal_name;
    int number_of_feedings = 0;

    public Animal(String given_species_name, String name) {
        species_name = given_species_name;
        animal_name = name;
    }

    public Animal() {
        this("deafault animal", "no name");
        stomach_contents = null;
    }

    public Animal(Animal another_animal, String name) {
        species_name = another_animal.species_name;
        animal_name = name;
    }

    public void feed(String food_for_this_animal) {
        stomach_contents[number_of_feedings] = food_for_this_animal;
        number_of_feedings++;
    }

    public void make_stomach_empty() {
        stomach_contents = null;
    }

    public void make_speak() {
        if (stomach_contents.length == 0 ) {
            System.out.print("\n Hello, I am a " + species_name + " called " + animal_name
                    + "\n My stomach is empty" + "\n");
        } else {
            for (int food_index = 0; food_index < number_of_feedings; food_index++) {
                System.out.print("\n Hello, I am a " + species_name + " called " + animal_name
                        + "\n I have eaten: " + stomach_contents[food_index] + " " + "\n");
            }
        }
    }
}
