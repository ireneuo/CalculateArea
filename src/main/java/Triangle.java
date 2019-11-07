public class Triangle implements Figure {

    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        double calculatedArea = a/2*h;
        return calculatedArea;
    }
}