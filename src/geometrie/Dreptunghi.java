package geometrie;

public class Dreptunghi implements Geometrie {
    double latime;
    double lungime;
    private String nume="dreptunghi";
    public String getNume(){
        return nume;
    }

    public void setLatime(double valoareLatime) {
        latime = valoareLatime;
    }

    public void setLungime(double valoareLungime) {
        lungime = valoareLungime;
    }

    @Override
    public double arie() {
        double r3 = latime * lungime;
        return r3;
    }
}
