package Strings;

public class String_Concepts {
    public static void main(String[] args) {
        //Creating Strings
        // Using literals
        // Stored in String Pool (a part of heap)
        String str1 = "Ritesh";
        String str3 = "Ritesh";

        // Using new Keyword
        // Stored in Heap
        String str2 = new String("Ritesh");

        //stores strings explicitly in string pool
        str2.intern();        
        if(str1 == str2)
            System.out.println("Str1 equals str2");
        if(str1 == str3)
            System.out.println("Str1 equals str3");

    }
}
