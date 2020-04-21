package shortestPath;

public class Museum extends Node implements Visitable,Payable,Classifiable{

    public Museum(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
