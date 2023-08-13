import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int prev=0;
        int curr=1;
        int neww=0;
        System.out.println("Enter the nth Value of fibonacci Numbers");
        int n= input.nextInt();
        if(n==0){
            System.out.println(0);
        } else if (n==1) {
            System.out.println(0);
            System.out.println(1);
        }else {
            System.out.println(0);
            System.out.println(1);
            for(int i=0; i<=n-2;i++){
                neww= curr+prev;
                prev=curr;
                curr=neww;
                System.out.println(neww);

            }
        }

    }
}
