import java.util.Scanner;

public class Rectangle implements Figure {


    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku a:");
        int a = scanner.nextInt();
        System.out.println("Podaj długość boku b:");
        int b = scanner.nextInt();;
        return a*b;
    }
}
