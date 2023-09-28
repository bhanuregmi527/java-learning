package recursion;

public class Main {
    public static void main(String[] args) {
        //print first 5 number using recursion
        print(0);

    }
    static int print(int n){
       if(n==6){
           return 5;
       }else {
           System.out.println(n);
         return   print(n+1);
       }

    }
}
