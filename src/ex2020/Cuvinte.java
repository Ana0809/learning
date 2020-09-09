package ex2020;

public class Cuvinte {
    public static void main(String[] args) {
        String prop ="Ana are multe mere delicioase, rosii si verzi";
       String c[]= prop.split(" ");
        int contor=0;
        for(int i=0;i<c.length;i++){
           contor++;
        }
        System.out.println(contor);
    }
}
