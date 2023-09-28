package recursion;

public class Main {
    public static void main(String[] args) {
        //print first 5 number using recursion
        print(1);

    }
    static void print(int n){
       if(n==6){
           return ;
       }
           System.out.println(n);
          print(n+1);

    }
}
