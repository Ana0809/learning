package inheritence;


public class Person extends Mamifer{
    protected String name;

    public void setName(String name){
        this.name= name;
    }
    protected String getName(){
        return name;
    }
    public void walk(){
        System.out.println("Person is walking");
    }
    public Person(){
        super();
        System.out.println("Person");
    }
    public Person(String name){
        this.name=name;
        System.out.println("Person name");
    }
}