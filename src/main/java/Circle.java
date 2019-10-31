import java.util.Scanner;

import static java.lang.Math.*;

public class Circle implements Figure {

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień okręgu");
        double r = scanner.nextInt();

        return PI*pow(r,2);
    }
}
