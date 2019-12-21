package zoo;

public class Ras extends Animal {
    private String nume = "ras haios";
    @Override
    public String culoare(){
        String culoare="are picatele";
        return culoare;

    }

    @Override
    public String deplasare(){
        String deplasare = "merge zvelt";
        return  deplasare;
    }
    public String getNume(){
        return nume;
    }
}

