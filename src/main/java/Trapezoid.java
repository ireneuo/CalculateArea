public class Trapezoid implements Figure {

    private double a;
    private double b;
    private double c;

    public Trapezoid(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double calculatedArea = (a+b)/2*c;
        return calculatedArea;
    }
}