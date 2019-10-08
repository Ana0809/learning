package inheritence;

public class Teacher extends Person {
    protected String [] classes;

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }
    public Teacher(){
        super();
        System.out.println("Teacher");
    }
    public Teacher( String [] classes){
        super("Andrei");
        this.classes = classes;
        System.out.println("Teacher classes");
    }
    public Teacher( String [] classes, String name){
        this.classes = classes;
        this.name= name;
        System.out.println("teacher clase si note");

    }

    @Override
    public void walk(){
        System.out.println("Teacher is walking");
    }
    public void trala(){
        System.out.println("teacher");
        super.walk();
    }
}

