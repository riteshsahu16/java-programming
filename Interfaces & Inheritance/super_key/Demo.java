package super_key;

public class Demo {
    public static void main(String[] args) {
        Redmi red = new Redmi("Redmi Note 11", 15000);
        Realme real = new Realme();

        System.out.println(real.model_name + real.price);

    }
}
