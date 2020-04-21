package shortestPath;

public class Hotel extends Node implements Classifiable,Payable {

    public Hotel(String name) {
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
