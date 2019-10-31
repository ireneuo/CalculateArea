import java.util.Scanner;

public class Triangle implements Figure{

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy trójkąta:");
        double a = scanner.nextInt();
        System.out.println("Podaj wyskość trojkąta:");
        double b = scanner.nextInt();;
        return a/2*b;
    }
}
