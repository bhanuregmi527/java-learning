import java.util.Scanner;

import static java.util.Collections.swap;

public class swapTwoNum {
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The swped first value is: "+a);
        System.out.println("The swped Second value is: "+b);


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first value:");
        int num1= input.nextInt();
        System.out.println("Enter the second value:");
        int num2= input.nextInt();
        swap(num1,num2);
        System.out.println(num1);
        System.out.println(num2);

    }


}
