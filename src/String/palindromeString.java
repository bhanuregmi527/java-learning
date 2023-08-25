package String;

public class palindromeString {
    public static void main(String[] args) {
        String str="radar";
        System.out.println(palin(str));


    }
    static boolean palin(String str){
        str = str.replaceAll("\\s", "").toLowerCase();

        // Compare with its reverse
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
