package recursion;

public class checkSortedArray {
    public static void main(String[] args) {
        int[]arr={2,4,6,10,6 };
        System.out.println(check(arr,0));

    }
    public static boolean check(int[]arr,int i){
        if(i== arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1]&& check(arr,i+1);
    }
}
