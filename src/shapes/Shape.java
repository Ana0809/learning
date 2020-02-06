package shapes;

abstract class Shape {
    public abstract String name();

    public abstract double computeArea();

    public abstract double computePerimeter();

    public abstract void enlarge(double factor);

    public boolean isLargerThan(Shape shape) {
        boolean b=true;
        if(this.computeArea()>shape.computeArea()){
            b=false;
        }
            return b;
    }
}