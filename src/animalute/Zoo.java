package animalute;

public class Zoo {
    Animal[] animals_in_zoo = new Animal[20];
    int number_of_animals_in_zoo = 0;

    public void add_animal(Animal new_animal_to_zoo) {
        animals_in_zoo[number_of_animals_in_zoo] = new_animal_to_zoo;
        number_of_animals_in_zoo++;

     //   System.out.println(new_animal_to_zoo.animal_name);
    }

    public void make_animals_speak() {
        for (int animal_index = 0; animal_index < number_of_animals_in_zoo; animal_index++) {
            System.out.print("\n Hello, I am  " + animals_in_zoo[animal_index].animal_name+" and I am new to zoo");
        }
    }
}