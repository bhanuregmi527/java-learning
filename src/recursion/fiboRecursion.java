package recursion;

public class fiboRecursion {

    public static void main(String[] args) {
        int num=fibo(6);
        System.out.println(num);
    }
static int  fibo(int n){

        if(n<2){
            return n;
        }
        else {
          return fibo(n-1)+fibo(n-2);
        }
}

}
