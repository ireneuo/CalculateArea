public class Rectangle implements Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }


    @Override
    public double calculateArea() {
        double calculatedArea = a * b;
        return calculatedArea;
    }

}
