package shapes;

public class Triangle extends Shape {
    private double edge;
    final double constanta = Math.sqrt(3);
    Point point2;
    Point point3;
    Point point4;

    public Triangle(double edge, Point point2, Point point3, Point point4) {
        this.edge = edge;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }
    @Override
    public String name(){
        String nume = "Triunghi";
        return  nume;
    }

    @Override
    public double computeArea() {
        double aria=(point2.getX() * (point3.getY() - point4.getY()) + point3.getX() * (point4.getY() - point2.getY()) + point4.getX() * (point2.getY()- point3.getY())) / 2;
        System.out.println("Aria triunghiului este " + Math.abs(aria));
        return Math.abs(aria);
    }

    @Override
    public double computePerimeter() {
        double perimetru= 3*edge;
        System.out.println("Perimetru triunghiului este " +perimetru);
        return perimetru;
    }

    @Override
    public void enlarge(double factor) {
        double rezultat = factor;         //????
       // System.out.println(rezultat);
    }
}

