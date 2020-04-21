package shortestPath;

public class Church extends Node implements Visitable{

    public Church(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public boolean isPayable() {
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
