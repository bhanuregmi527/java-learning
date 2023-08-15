import java.util.Scanner;

public class palindrome {

    static boolean palin(int n){
        int original=n;
        int result=0;
        while(n>0){
            int rem;
            rem=n%10;
            n=n/10;
            result=result*10+rem;
        }
        return original==result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter the number");
        int num= input.nextInt();
        System.out.println(palin(num));

    }
}
