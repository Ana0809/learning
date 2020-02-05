package animalute;

class Animals {
    public static void main(String[] not_in_use) {
        Animal cat_object = new Animal("cat", "Ludwing");
        Animal dog_object = new Animal("vegetarian dog", "Lexi");
        cat_object.feed("fish");
        cat_object.feed("chicken");
        dog_object.feed("salad");
        dog_object.feed("potatoes");
        Animal another_cat = new Animal(cat_object, "Miau");
        another_cat.feed("milk");
//        cat_object.make_stomach_empty() ;
//        dog_object.make_stomach_empty();
//        another_cat.make_stomach_empty();
        cat_object.make_speak();
        dog_object.make_speak();
        another_cat.make_speak();
        Animal some_animal = new Animal();
        some_animal.make_speak();

        Zoo test_zoo = new Zoo();
        test_zoo.add_animal(cat_object);
        test_zoo.add_animal(dog_object);
        test_zoo.add_animal(another_cat);
        test_zoo.add_animal(some_animal);
        test_zoo.make_animals_speak();

        Carnivore tiger = new Carnivore( "tiger", "Dudu") ;
        Animal cow  = new Animal( "cow", "Fulga" ) ;
        tiger.feed(cow) ;
        tiger.make_speak();
    }
}





