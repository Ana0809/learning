package inheritence;

public class Main {
    public static void main(String[] args) {
        String[] classes = {"mate", "romana"};
        int [] note = {2,4};
        Teacher t = new Teacher(classes, "Mihai");
        Student s= new Student(note);
        Person p = new Person("Andrei");
        System.out.println(p.getName());
        System.out.println(t.getName());
        for(int i = 0; i<t.classes.length; i++){
            System.out.println(t.getClasses()[i] + "" +t.getName());
        }

//       t.setName("Andrei");
//        t.setClasses(classes);
//        Person p = new Teacher();
//        p.walk();
//        p = new Student();
//        p.walk();
        t.trala();
    }
}
