package zoo;

public abstract class Animal {
    abstract String culoare();

   int picioare(){
        int picioare = 4;
        return picioare;
    }

    abstract String deplasare();

    abstract String getNume();
}
