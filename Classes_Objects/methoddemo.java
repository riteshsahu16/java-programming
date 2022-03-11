package Classes_Objects;
public class methoddemo {
    //method signature
    // method overloading
    // varargs construct
    // return 
        // function execution, return keyword 
        // subclass
    
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int... int_list){
        int sum = 0;
        for(int v: int_list){
            sum += v;
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
