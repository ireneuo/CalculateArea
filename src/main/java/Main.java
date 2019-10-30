import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz figurę: \n 1. Kwadrat.\n 2. Prostokąt.\n 3. Trójkąt.\n 4. Trapez.");
        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                break;
            case 2:
                Rectangle rectangleArea = new Rectangle();
                System.out.println("Pole prostokata wynosi: "+ rectangleArea.calculateArea());
                break;
            case 3:
                Triangle triangleArea = new Triangle();
                System.out.println("Pole trójkąta wynosi: "+ triangleArea.calculateArea());
                break;
            case 4:
                break;
        }
    }
}
