package shapes;

class Circle extends Shape {

    Point point;
    private double radius;
    final static private double pi = 3.14;

    public Circle(double radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    @Override
    public String name() {
        String nume = "Cerc";
        return nume;
    }

    @Override
    public double computeArea() {
        double arie = radius * pi;
        System.out.println("Aria cercului este: "+arie);
        return arie;
    }

    @Override
    public double computePerimeter() {
        double perimetru = pi*radius*radius;
        System.out.println("Perimetrul cercului este: "+ perimetru);
        return perimetru;
    }

    @Override
    public void enlarge(double factor) {

    }

}
