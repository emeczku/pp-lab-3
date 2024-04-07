import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.5, 3.5);
        Circle circle = new Circle(point, 5.0);

        point.setX(1.5);
        point.setY(2.5);

        System.out.println(point.getX());
        System.out.println(point.getY());

        System.out.println(circle.getCenter());
        System.out.println(circle.getRadius());
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.getArea());
    }
}


