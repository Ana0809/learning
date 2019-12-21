package zoo;

public class Urs extends Animal {
    private String nume = "urs dragut";
 @Override
   public String culoare(){
     String culoare="alb perlat";
     return culoare;
 }
 @Override
 public String deplasare(){
     String deplasare = "merge lenes";
     return  deplasare;
 }
    public String getNume(){
        return nume;
    }
}
