import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
            new Circle(new Point(0, 1), 5),
            new ColoredCircle(new Point(1, 1), 2, "czerwony"),
            new Circle(new Point(1, 2), 4),
            new ColoredCircle(new Point(4, 3), 3, "zielony")
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }

        
        Rectangle rectangle = new Rectangle(11.0, 4.0);
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
