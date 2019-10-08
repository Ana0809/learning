package inheritence;

public class Person2
{
    public String name;

    public Person2() {
        name = "No name yet.";
    }
    public Person2(String n) {
        name = n;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("Name: " + name);
    }
      //  public boolean equals(Object p) {
          //  return name.equals(p.name);  //  return (this == obj);
      //}
}

