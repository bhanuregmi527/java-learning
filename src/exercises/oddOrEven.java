package exercises;

public class oddOrEven {
    public static void main(String[] args) {
        int a=1;
        System.out.println(isOdd(a));
    }
    static boolean isOdd(int a){
        return (a&1)==1;
    }
}
