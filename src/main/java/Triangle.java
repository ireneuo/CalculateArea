import java.util.Scanner;

public class Triangle {

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy trójkąta:");
        int a = scanner.nextInt();
        System.out.println("Podaj wyskość trojkąta:");
        int b = scanner.nextInt();;
        return a/2*b;
    }
}
