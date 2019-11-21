public class Main {

    public static void main(String[] args) {

        Figure circle = new Circle(3);
        circle.calculateArea();

        Figure rectangle = new Rectangle(4,6);
        rectangle.calculateArea();

        Figure square = new Square(4);
        rectangle.calculateArea();

        Figure trapezoid = new Trapezoid(3,5,2);
        trapezoid.calculateArea();

        Figure triangle = new Triangle(5, 9);
        triangle.calculateArea();

        System.out.println("Pole okregu wynosi: " + circle.calculateArea());
        System.out.println("Pole prostokąta wynosi: " + rectangle.calculateArea());
        System.out.println("Pole kwadratu wynosi: " + square.calculateArea());
        System.out.println("Pole trapezu wynosi: " + trapezoid.calculateArea());
        System.out.println("Pole trójkata wynosi: " + triangle.calculateArea());
    }
}

