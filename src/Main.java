import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Salary:");
        int salary= input.nextInt();

        if(salary>=4000){
            int bonus=200;
            System.out.println("Your expected bonus is "+bonus);
        }else if(salary>=2000 && salary<4000)  {
        int bonus=200;
            System.out.println("Your expected bonus is "+bonus);
        }
        else {
            int bonus=100;
            System.out.println("Your expected bonus is "+bonus);
        }
        }
    }
