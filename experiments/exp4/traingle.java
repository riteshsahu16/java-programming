package experiments.exp3.exp4;

public class traingle extends dimension {

    private double base;
    private double height;

    public traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    protected void show_area() {
        System.out.println("ARea of traingle is " + 0.5 * base * height);
    }
    
}
