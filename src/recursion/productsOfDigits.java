package recursion;

public class productsOfDigits {
    public static void main(String[] args) {
        int n=1432;
        System.out.println(product(n));

    }
    public static int product(int n){
        if(n%10==n){
            return n;
        }
            return (n%10) * product(n/10);

    }
}
