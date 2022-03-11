package experiments.exp3.exp4;

public class rectangle extends dimension {
    private double length;
    private double breadth;

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }   

    @Override
    protected void show_area() {
        System.out.println("ARea of rectangle is " + length*breadth);
    }
}
