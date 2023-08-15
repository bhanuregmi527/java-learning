import java.util.Scanner;

public class factorial {
   static int fact(int a){

       int result=1;
       if(a==0){
           result=0;
           return result;
       } else if (a==1) {
           return result;
       } else {
           for (int i=1;i<=a;i++){
               result=result*i;

           }
           return result;
       }

   }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num= input.nextInt();
        System.out.println(fact(num));

    }
}
