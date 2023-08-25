package String;

public class example {
    public static void main(String[] args) {
        String str="raadar";
        System.out.println(palindrome(str));



    }
    static boolean palindrome(String str){
        str = str.replaceAll("\\s", "").toLowerCase();

        // Compare with its reverse
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
