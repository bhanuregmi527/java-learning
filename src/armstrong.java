import java.util.Scanner;

public class armstrong {
     static boolean arm(int a){

         int sum=0;
         int original=a;

      while (a>0){
          int rem;
          rem=a%10;
          a=a/10;
          rem=rem*rem*rem;
          sum=sum+rem;

      }
      if(sum==original){
          return true;

      }else {
          return false;
      }
     }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Input the number:");
        int num= input.nextInt();
        System.out.println(num);
        System.out.println(arm(num));

    }
}
