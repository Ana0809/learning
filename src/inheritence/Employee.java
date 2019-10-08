package inheritence;


public class Employee extends Person2 {
    private double anualSalary;
    private int year;
    private String insuranceNumber;

    Employee(String name, double anualSalary, int year, String insuranceNumber) {
        super(name);
        this.anualSalary = anualSalary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public void print() {
        System.out.println(name + " " + anualSalary + " " + year + " " + insuranceNumber);
    }
}


