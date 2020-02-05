package geometrie;

public class Patrat implements Geometrie{
  private double latura;
  private String nume="patrat";
    public String getNume(){
        return nume;
    }

    public void setLatura(double valoareLatura){
      this.latura= valoareLatura;
  }
  @Override
    public double arie(){
      double r1 = latura*latura;
      return  r1;
  }

}
