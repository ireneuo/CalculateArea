public class Square extends Rectangle implements Figure{

    private double a;

     public Square(double a){
        this.a = a;
    }


    @Override
    public double calculateArea() {
        double calculatedArea = Math.pow(a,2);
        return calculatedArea;
    }
}
