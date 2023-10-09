package exercises;

public class findUnique {
    public static void main(String[] args) {
        int[]arr= {1,2,2,1,6,4,3,4,3};
        System.out.println(ans(arr));
    }
    private static int ans(int[]arr){
        int unique=0;
        for ( int n: arr){
            unique=unique^n;
        }
    return unique;
    }
}
