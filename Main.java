import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        double length = 5;
        double width = 3;

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Właściwości prostokąta:");
        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
