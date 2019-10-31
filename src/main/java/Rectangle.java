import java.util.Scanner;

public class Rectangle implements Figure {


    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku a:");
        double a = scanner.nextInt();
        System.out.println("Podaj długość boku b:");
        double b = scanner.nextInt();;
        return a*b;
    }
}
