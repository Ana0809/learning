package ex2020;

public class Singleton {

    static Singleton s = new Singleton();
    private Singleton(){

    }
     static Singleton matoda(){
         System.out.println("obiectul meu");
        return s;
    }
}
