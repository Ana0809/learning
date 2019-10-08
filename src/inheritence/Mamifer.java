package inheritence;

public class Mamifer {
    protected String specie;

    public Mamifer() {
        System.out.println("Mamifer");
    }
    public Mamifer(String specie) {
        System.out.println("Mamifer specie");
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }
    public void w(){
        System.out.println("Mamifers are great!!!");
    }
}

