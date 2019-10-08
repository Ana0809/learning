package pack;
import java.util.regex.Pattern;
public class Student {
    private String nume;
    private int[] note;
    private double medie;
    private static Biblioteca biblioteca;


    public Student(String nume, int[] note) {
        this.note = note;
        if (esteCorect(nume)) {
            this.nume = nume;
        } else {
            System.out.println("Nume incorect!");
        }
    }

    public boolean esteCorect(String name) {
        return (Pattern.matches(".*^[a-z-A-Z]*$", name));
    }

    public String getNume() {
        return nume;
    }

    public void setNote(int[] note) {
        this.note = note;
    }

    public int[] getNote() {
        return note;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    double suma = 0;
    double media = 0;

    public double getMedie() {
        return medie;
    }
}
