package recursion;

public class jpt1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }
    static boolean isPalindrome(int x) {
        int target=x;
        int rem;
        int num=0;
        while(x>0){
            rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        if(num==target){
            return true;
        }
        return false;


    }
}
