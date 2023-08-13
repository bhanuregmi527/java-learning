import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        //Q. Find the largest number among the input numbers
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int largest=a;
        if (b>largest) {
            largest=b;
        }
       if(c>largest){
           largest=c;

        }
        System.out.println("the largest Number is:"+ largest);

    }
}
