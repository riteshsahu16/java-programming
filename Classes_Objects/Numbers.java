package Classes_Objects;
import java.lang.reflect.Array;

/**
 * Numbers
 */
public class Numbers {
    public static void main(String[] args) {
        int fuck = 6; // primitive
        
        float f = Float.parseFloat("5");
        
        String str = "Rtieish";
        System.out.println(str);
        String newstr = str.replace('i', 'x');
        String stringl = str.replace("ti", "f it");
        System.out.println(newstr);
        System.out.println(stringl);

        String skldfj = str.replaceAll("ri", "dfgkgf");
        System.out.println(skldfj);
        char ch = 6;
        System.out.println(ch);

    
        Integer i = 5; //autoboxing
        int j = Integer.valueOf(5);  //unboxing      
        
    }
    
}
