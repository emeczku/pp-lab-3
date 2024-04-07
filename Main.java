import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.5, 3.5);
        Circle circle = new Circle(point, 5.0);
        ColoredCircle coloredCircle = new ColoredCircle(point, 5.0, "Blue");
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(new Point(0, 0), 1);
        circles[1] = new Circle(new Point(1, 1), 2);
        circles[2] = new ColoredCircle(new Point(2, 2), 3, "Yellow");
        circles[3] = new ColoredCircle(new Point(3, 3), 4, "Blue");
        circles[4] = new ColoredCircle(new Point(4, 4), 5, "Green");

        point.setX(1.5);
        point.setY(2.5);

        System.out.println(point.getX());
        System.out.println(point.getY());

        System.out.println(circle.getCenter());
        System.out.println(circle.getRadius());
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.getArea());

        System.out.println(coloredCircle.getColor());

        for (Circle c : circles) {
            System.out.println(c.calculatePerimeter());

            if (c instanceof ColoredCircle) {
                System.out.println(((ColoredCircle) c).getColor());
            }
        }
    }
}


