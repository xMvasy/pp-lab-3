import geometry.Square;

public class Main {
    public static void main(String[] args) {
        double sideLength = 4;

        Square square = new Square(sideLength);

        System.out.println("Właściwości kwadratu:");
        System.out.println("Długość boku: " + square.getLength());
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    }
}
