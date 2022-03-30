package super_key;

public class Mobile {

    protected String model_name;
    protected double price;

    public Mobile(String name, double price) {
        this.model_name = name;
        this.price = price;

    }
    public Mobile() {
        super();
    }
    
    protected void PowerOn(){
        System.out.println("Powering on " + this.model_name);
    }

    protected void PowerOff(){
        System.out.println("Powering off " + this.model_name);
    }
}