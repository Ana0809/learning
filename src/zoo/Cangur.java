package zoo;

public class Cangur extends Animal {
    private String nume = "cangur saltaret";
    @Override
    public String culoare(){
        String culoare="maro deschis";
        return culoare;

    }
    @Override
    public int picioare(){
        int picioare = 2;
        return picioare;
    }
    @Override
    public String deplasare(){
        String deplasare = "salta fericit";
        return  deplasare;
    }
    public String getNume(){
        return nume;
    }
}

