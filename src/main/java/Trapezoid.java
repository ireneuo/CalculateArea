import java.util.Scanner;

public class Trapezoid implements Figure {

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy a:");
        double a = scanner.nextInt();
        System.out.println("Podaj długość podstawy b:");
        double b = scanner.nextInt();;
        System.out.println("Podaj wysokość b:");
        double c = scanner.nextInt();;
        return (a+b)/2*c;
    }

}
