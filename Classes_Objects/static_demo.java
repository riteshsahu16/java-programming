package Classes_Objects;
public class static_demo {
    static int count;
    public static_demo() {
        count = 5;
    }
    int  getcount(){
        return count;
    }

    public static void main(String[] args) {
        static_demo sd = new static_demo();
        System.out.println(sd.getcount());
    }
}
