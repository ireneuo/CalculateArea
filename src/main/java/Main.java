import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz figurę: \n 1. Kwadrat.\n 2. Prostokąt.\n 3. Trójkąt.\n 4. Trapez.\n 5. Okrąg.");
        int choose = scanner.nextInt();

        while (choose < 1 || choose > 5){
            System.out.println("Nieprawidlowy wybór, Wybierz jeszcze raz:");
            choose = scanner.nextInt();
        }

            switch (choose) {
                case 1:
                    Square squareArea = new Square();
                    System.out.println("Pole kwadratu wynosi: " + squareArea.calculateArea());
                    break;
                case 2:
                    Rectangle rectangleArea = new Rectangle();
                    System.out.println("Pole prostokata wynosi: " + rectangleArea.calculateArea());
                    break;
                case 3:
                    Triangle triangleArea = new Triangle();
                    System.out.println("Pole trójkąta wynosi: " + triangleArea.calculateArea());
                    break;
                case 4:
                    Trapezoid trapezoidArea = new Trapezoid();
                    System.out.println("Pole trapezu wynosi: " + trapezoidArea.calculateArea());
                    break;
                case 5:
                    Circle circleArea = new Circle();
                    System.out.println("Pole okręgu wynosi: " + circleArea.calculateArea());
                    break;
        }
    }
}

