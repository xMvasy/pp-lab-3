import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3, 4);
        double radius = 5;
        String color = "red";

        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);

        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
    }
}
