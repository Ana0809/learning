package inheritence;

public class Student extends Person {
    private int[] note;

    protected int[] getNote() {
        return note;
    }

    public void setNote(int[] note) {
        this.note = note;
    }
    public Student(){
        System.out.println("Student");
    }
    public Student(int[] note){
        System.out.println("Student note");
    }
}
