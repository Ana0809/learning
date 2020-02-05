package geometrie;

public class Cerc implements Geometrie {
   private double raza;
    final double pi = 3.14;
    private String nume = "cerc";

    public void setRaza(double valoareRaza){
        raza = valoareRaza;
    }
    public String getNume(){
        return nume;
    }
@Override
    public double arie(){
        double r2 = pi *raza;
        return r2;
}
}
