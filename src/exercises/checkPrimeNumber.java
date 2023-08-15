import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter the number");
        int num= input.nextInt();
        System.out.println(isPrime(num));

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;

    }
}
