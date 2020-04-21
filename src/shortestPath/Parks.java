package shortestPath;

public class Parks extends Node implements Payable{

    public Parks(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public boolean isVisitable() {
        return false;
    }
    @Override
    public boolean isClassifable() {
        return false;
    }
    @Override
    public String toString() {
        return name;
    }

}
