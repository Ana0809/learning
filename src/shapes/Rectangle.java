package shapes;

public class Rectangle extends Shape {
    private double edge2;
    Point ul;
    Point ur;
    Point lr;
    Point ll;

    public Rectangle(double edge2, Point p_ul, Point p_ur, Point p_lr, Point p_ll) {
        this.edge2 = edge2;
        ul = p_ul;
        ur = p_ur;
        lr = p_lr;
        ll = p_ll;
    }

    @Override
    public String name() {
        String nume = "Dreptunghi";
        return nume;
    }

    @Override
    public double computeArea() {
        double length = Math.sqrt((ur.getX() - ul.getX()) * (ur.getX() - ul.getX()) + (ur.getY() - ul.getY()) * (ur.getY() - ul.getY())); //calculates length
        double height = Math.sqrt((ur.getX() - lr.getX()) * (ur.getX() - lr.getX()) + (ur.getY() - lr.getY()) * (ur.getY() - lr.getY())); //calculates height
        System.out.println("Aria dreptunghiului este: "+length * height);
        return (length * height);


    }

    @Override
    public double computePerimeter() {
        float distab = (float) Math.sqrt(Math.pow(ul.getX() - ur.getX(), 2) + Math.pow(ul.getX() - ur.getY(), 2) );
        float distbc= (float) Math.sqrt(Math.pow(lr.getX() - ll.getX(), 2) + Math.pow(lr.getX() - ll.getY(), 2) );
        float perimetru = distab*2+distbc*2;
        System.out.println("Perimetru dreptunghiului este: " + perimetru);
        return perimetru;
    }

    @Override
    public void enlarge(double factor) {

    }
}
