import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;
import geometry.Square;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
            new Circle(new Point(0, 1), 6),
            new ColoredCircle(new Point(1, 1), 5, "czerwony"),
            new Circle(new Point(2, 3), 6),
            new ColoredCircle(new Point(3, 3), 3, "zielony")
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }

        Rectangle rectangle = new Rectangle(11.0, 5.0);
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());

      
        Square square = new Square(8.0);
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    }
}
