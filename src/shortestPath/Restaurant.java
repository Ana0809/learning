package shortestPath;

public class Restaurant extends Node implements Classifiable,Visitable{

    public Restaurant(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public boolean isPayable() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

}
