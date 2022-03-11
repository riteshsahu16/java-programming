package Classes_Objects;

public class constructordemo {
    private int _id;
    private String _name;

    //constructor overloadig
    public constructordemo(int id, String name) {
        this._id = id; // pointer to current object
        this._name = name;
    }
    public constructordemo(constructordemo cd) {
        this(cd._id, cd._name); // explictit constructor invocation
    }

    public static void main(String[] args) {
            //copy constructors
            constructordemo cd1 = new constructordemo(1, "Ritesh");
            constructordemo cd2 = new constructordemo(cd1);
            System.out.println(cd2._id + " " + cd2._name);
    }
}
