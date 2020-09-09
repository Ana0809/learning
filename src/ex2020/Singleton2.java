package ex2020;


public class Singleton2 {

     private Singleton2() {
    }
   static Singleton2 s = new Singleton2();

    static Singleton2 met(){
        System.out.println("my sgt");
        return s;
    }

    public static void main(String[] args) {
        met();
    }
}
