package experiments.exp3;

public class shape {
    protected int x = 00;
    protected int y = 01;
    public shape() {
        // constructor
        System.out.println("Shape class constructor called");
    }    
    void get_xyvalue(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Method to override
    void  show_xyvalue(){
        System.out.println("x-value" + x);    
        System.out.println("y-value" + y);    
    }
    
}
