package shortestPath;

public class Airport extends Node implements Payable, Classifiable {

    public Airport(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public boolean isVisitable() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
