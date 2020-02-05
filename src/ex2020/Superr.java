package ex2020;

public class Superr {
}

class Animal {
    Animal() {
        System.out.println("animal is created");
    }
  void nume(){
      System.out.println("catel");

    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("dog is created");
    }

    @Override
    void nume() {
        super.nume();
        System.out.println("pisi");
    }
}

class TestSuper4 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.nume();
    }
}