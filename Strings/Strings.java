public class Strings {
    public static void main(String args[])
    {
        //args[0]
        String sentence = "This is a sentence";
        String words[] = sentence.split(" ");
        for (String string : words) {
            System.out.print(string + " ");
        }
        System.out.println(args[1]);
    }
}
