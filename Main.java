import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(new Point(0, 0), 1);
        circles[1] = new Circle(new Point(1, 1), 2);
        circles[2] = new ColoredCircle(new Point(2, 2), 3, "red");
        circles[3] = new ColoredCircle(new Point(3, 3), 4, "blue");

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni koła: " + area);

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}
