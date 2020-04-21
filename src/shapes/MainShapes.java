package shapes;

public class MainShapes {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Circle circle = new Circle(2, p1);
        circle.computeArea();
        circle.computePerimeter();
        circle.enlarge(3);
        Point p2 = new Point(15, 14);
        Point p3 = new Point(23, 40);
        Point p4 = new Point(50, 25);
        Triangle triangle = new Triangle(8, p2, p3, p4);
        triangle.computeArea();
        triangle.computePerimeter();
        triangle.enlarge(8);
        Point p5 = new Point(10, 10);
        Point p6 = new Point(10, 26);
        Point p7 = new Point(45, 26);
        Point p8 = new Point(45, 10);
        Rectangle rectangle = new Rectangle(4, p5, p6, p7, p8);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.enlarge(2);
        Shape[] shapesArray = new Shape[3];
        shapesArray[0] = circle;
        shapesArray[1] = triangle;
        shapesArray[2] = rectangle;
        for (int i = 0; i < shapesArray.length; i++) {
            System.out.println("Formele afisate din array sunt: " + shapesArray[i].name());
        }
        if(circle.isLargerThan(triangle)==false){
            System.out.println("Aria cercului este mai mare decat aria triunghiului");
        }else System.out.println("Aria triunghiului este mai mare decat aria cercului");
    }
}
