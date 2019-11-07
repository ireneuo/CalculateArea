public class Circle implements Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
            double calculatedArea = Math.PI * Math.pow(r, 2);
            return calculatedArea;
    }
}
