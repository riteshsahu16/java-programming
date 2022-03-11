package experiments.exp3;

public class Rectangle extends shape{
    private int _length, _breadth;
    public Rectangle()
    {
        System.out.println("Rectangle defualt constructor called");
    }
    public Rectangle(int length, int breadth) {
        _length = length;
        _breadth = breadth;
        System.out.println("Rectangle parameterized constructor called");
        
    }

    void show_lb()
    {
        System.out.println("length of rectangle : " + _length);
        System.out.println("breadth of rectangle : " + _breadth);
    }

    @Override
    void  show_xyvalue(){
        x = 98; y = 99;
        System.out.println("Modified x-value" + x);    
        System.out.println("Modified y-value" + y);    
    }
    
}
